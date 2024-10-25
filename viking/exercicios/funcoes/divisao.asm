main
	ldw r1,a
	sub sp,2
	stw r1,sp
	ldw r1,b
	sub sp,2
	stw r1,sp
	ldi r6,return
	bnz r7,divisao
	
return
	ldw r3,sp
	add sp,2
	stw r3,0xf002
	hcf
divisao
	ldw r2,sp
	add sp,2
	ldw r1,sp
	add sp,2
	ldi r3,0
loop
	slt r4,r1,r2
	bnz r4,end_loop
	sub r1,r2
	add r3,1
	bnz r7,loop
end_loop
	sub sp,2
	stw r3,sp
	bnz r7,r6			

a	10
b	2