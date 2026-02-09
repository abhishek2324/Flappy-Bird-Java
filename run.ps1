# Flappy Bird Java - Run Script
# Run this script to compile and launch the game

Set-Location -Path $PSScriptRoot

Write-Host "Cleaning old build..." -ForegroundColor Yellow
if (Test-Path out) { 
    Remove-Item -Recurse -Force out 
}

Write-Host "Compiling Java files..." -ForegroundColor Yellow
javac -d out src\App.java src\FlappyBird.java

if ($LASTEXITCODE -ne 0) {
    Write-Host "Compilation failed!" -ForegroundColor Red
    exit 1
}

Write-Host "Copying image files..." -ForegroundColor Yellow
New-Item -ItemType Directory -Force out | Out-Null
Copy-Item src\*.png out\

Write-Host "Starting game..." -ForegroundColor Green
java -cp out App
