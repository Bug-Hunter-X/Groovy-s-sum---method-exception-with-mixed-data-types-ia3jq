def list = [1, 2, 3, 4, 5]

println list.sum() //This will work fine

def list2 = [1, 2, "a", 4, 5]

println list2.sum() //This will throw a groovy.lang.MissingMethodException