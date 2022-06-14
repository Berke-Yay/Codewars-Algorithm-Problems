def count_bits(n):
    binary =[]
    while n!=1:
        binary.append(n%2)
        n=n//2
    return binary.count(1)+1
print(count_bits(50))