t=int(input())
for i in range(t):
    n,x,p=map(int,input().split())
    z=x-n
    y=3*x
    a=y+z
    if a>=p:
        print('pass')
    elif a<p:
        print('fail')
