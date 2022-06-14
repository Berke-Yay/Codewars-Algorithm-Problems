def is_isogram(string):
    #your code here

    string = string.lower()
    for i in string:
        if string.count(i)>1:
            return False
    return True
is_isogram("")