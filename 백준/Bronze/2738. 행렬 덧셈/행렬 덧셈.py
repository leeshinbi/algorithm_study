N,M = map(int,input().split())

matrix_A= [list(map(int,input().split()))for i in range(N)]
matrix_B= [list(map(int,input().split()))for i in range(N)]

result_matrix = [[matrix_A[i][j] + matrix_B[i][j] for j in range(M)] for i in range(N)]

for row in result_matrix:
    print(" ".join(map(str,row)))