000000    mov ax,bx
    move a string de bx para ax
000001    mov ax,1
    move o hexValue de 1 que esta na memoria para a string de ax
000010    mov [ax],bx
000011    mov [ax],1
000100    mov [1],ax
000101    mov [1],1
000110    mov ax,[1]
000111    mov ax,[bx]
001000    jmp 123
001001    je 123
001010    jne 123
001011    jg 123
001100    jge 123
001101    jl 123
001110    jle 123
001111    add ax,bx
010000    add ax,1
010001    sub ax,bx
010010    sub ax,1
010011    mul ax,bx
010100    mul ax,1
010101    div ax,bx
010110    div ax,1
010111    mod ax,bx
011000    mod ax,1
