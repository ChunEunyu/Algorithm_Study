# 언어 : Python , (성공/실패) : 1/2 , 메모리 : 30860 KB , 시간 : 76 ms
while True:
    a, b = map(int, input().split())
    if a>b:
        print("Yes")
    elif a==0 and b==0:
        break
    else:
        print("No")
