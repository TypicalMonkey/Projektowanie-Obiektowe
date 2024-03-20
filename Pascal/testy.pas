program Tests;

procedure RandomNumbers(from_, to_: Integer; ile: Integer; var numbers: array of Integer);
var
  i: Integer;
begin
  Randomize;
  for i := Low(numbers) to High(numbers) do
    numbers[i] := Random((to_ - from_) + 1) + from_;
end;

procedure BubbleSort(var numbers: array of Integer);
var
  i, temp: Integer;
  swapped: Boolean;
begin
  repeat
    swapped := False;
    for i := Low(numbers) to High(numbers) - 1 do
    begin
      if numbers[i] > numbers[i + 1] then
      begin
        temp := numbers[i];
        numbers[i] := numbers[i + 1];
        numbers[i + 1] := temp;
        swapped := True;
      end;
    end;
  until not swapped;
end;

procedure TestRandomNumbers(var success: Boolean);
var
  numbers: array[1..50] of Integer;
  i: Integer;
begin
  RandomNumbers(0, 100, 50, numbers);
  for i := Low(numbers) to High(numbers) do
    if not ((numbers[i] >= 0) and (numbers[i] <= 100)) then
    begin
      writeln('TestRandomNumbers niepowodzenie');
      success := False;
      Exit;
    end;
  success := True;
end;

procedure TestBubbleSort(var success: Boolean);
var
  numbers: array[1..5] of Integer = (5, 3, 4, 1, 2);
  i: Integer;
begin
  BubbleSort(numbers);
  for i := Low(numbers) to High(numbers) - 1 do
    if not (numbers[i] <= numbers[i + 1]) then
    begin
      writeln('TestBubbleSort niepowodzenie');
      success := False;
      Exit;
    end;
  success := True;
end;

procedure TestBubbleSortEmptyArray(var success: Boolean);
var
  numbers: array of Integer;
begin
  SetLength(numbers, 0);
  BubbleSort(numbers);
  if Length(numbers) <> 0 then
  begin
    writeln('TestBubbleSortEmptyArray niepowodzenie');
    success := False;
    Exit;
  end;
  success := True;
end;

procedure TestBubbleSortSingleElement(var success: Boolean);
var
  numbers: array[1..1] of Integer = (42);
begin
  BubbleSort(numbers);
  if numbers[1] <> 42 then
  begin
    writeln('TestBubbleSortSingleElement niepowodzenie');
    success := False;
    Exit;
  end;
  success := True;
end;

procedure TestBubbleSortAlreadySorted(var success: Boolean);
var
  numbers: array[1..5] of Integer = (1, 2, 3, 4, 5);
  i: Integer;
begin
  BubbleSort(numbers);
  for i := Low(numbers) to High(numbers) do
    if numbers[i] <> i then
    begin
      writeln('TestBubbleSortAlreadySorted niepowodzenie');
      success := False;
      Exit;
    end;
  success := True;
end;

procedure RunTests;
var
  success: Boolean;
begin
  success := True;
  TestRandomNumbers(success);
  TestBubbleSort(success);
  TestBubbleSortEmptyArray(success);
  TestBubbleSortSingleElement(success);
  TestBubbleSortAlreadySorted(success);
  if success then
    writeln('Testy pomyślne')
  else
    writeln('Testy niepomyślne');
end;

begin
  RunTests;
end.
