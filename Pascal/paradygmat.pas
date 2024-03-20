program RandomNumber;

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

var
  numbers: array[1..50] of Integer;
  i: Integer;

begin
  RandomNumbers(0, 100, 50, numbers);
  BubbleSort(numbers);
  writeln('Posortowane liczby:');
  for i := Low(numbers) to High(numbers) do
    writeln(numbers[i]);
end.
