#!/bin/bash

BASE_URL="http://localhost:8000" 

ENDPOINT1="/products"

echo "Testowanie endpointu: $BASE_URL$ENDPOINT1"
curl -X GET "$BASE_URL$ENDPOINT1"


