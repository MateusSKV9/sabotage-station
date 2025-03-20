#!/bin/bash

echo "Puxando do Repositório A..."
git pull origin master

echo "Mandando para o Repositório B..."
git push sabotage-station-java master

echo "Sincronizado"
