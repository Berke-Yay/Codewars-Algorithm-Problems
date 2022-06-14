import math
def find_next_square(sq):
    # Return the next square if sq is a square, -1 otherwise
    number = math.sqrt(sq)
    if number!=int(number):
        return -1
    else:
        return (number+1)**2