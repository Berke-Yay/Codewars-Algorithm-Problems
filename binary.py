from unittest import result


def add_binary(a,b):
    #your code here
    result_reverse =""
    result=""
    sum = a+b
    while sum!=1:
        result_reverse += str(sum%2)
        sum = sum//2
    result_reverse+="1"
    for i in range(-1,(len(result_reverse)*-1)-1,-1):
        result+=result_reverse[i]
    return result
print(add_binary(5,9))