word = input()
alphabet = "abcdefghijklmnopqrstuvwxyz"
result = [-1 for _ in range(len(alphabet))]

for i in range(len(alphabet)):
    for j in range(len(word)):
        if alphabet[i] == word[j]:
            result[i] = j
            break

for res in result:
    print(res,end=' ')