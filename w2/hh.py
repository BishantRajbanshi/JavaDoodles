set1 = {10, 20, 30, 40, 50}
set2 = {30, 40, 50, 60, 70}
set3 = {10, 20, 30}

length_set1 = len(set1)
print("Length of set1:", length_set1)

sum_set2 = sum(set2)
print("Sum of elements in set2:", sum_set2)

union_set = set1.union(set2)
print("Union of set1 and set2:", union_set)

intersection_set = set1.intersection(set2)
print("Intersection of set1 and set2:", intersection_set)

set1_minus_set2 = set1 - set2
print("Difference of set1 and set2:", set1_minus_set2)

set2_minus_set1 = set2 - set1
print("Difference of set2 and set1:", set2_minus_set1)

is_subset_set1 = set3.issubset(set1)
print("Is set3 a subset of set1?", is_subset_set1)
is_subset_set2 = set3.issubset(set2)
print("Is set3 a subset of set2?", is_subset_set2)

complement_set1 = set(range(1, 51)) - set1
print("Complement of set1:", complement_set1)

is_present_15_set1 = 15 in set1
print("Is 15 present in set1?", is_present_15_set1)

set1.add(60)
print("Updated set 1:", set1)

set2.discard(60)
print("Updated set 2:", set2)

set3.clear()
print("Set 3 after removing all elements:", set3)

max_value_set2 = max(set2)
print("Maximum value in set2:", max_value_set2)
min_value_set2 = min(set2)
print("Minimum value in set2:", min_value_set2)
