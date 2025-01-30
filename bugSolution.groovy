def list2 = [1, 2, "a", 4, 5]

def sumList(list) {
    sum = 0
    list.each { element ->
        if (element instanceof Integer) {
            sum += element
        }
    }
    return sum
}

println sumList(list2) // Output: 12

//Alternative solution using findAll and sum
println list2.findAll { it instanceof Integer }.sum() // Output: 12