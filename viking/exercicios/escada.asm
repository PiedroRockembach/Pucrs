main
	ldw r1,len
	ldi r2,0
	bnz r7,loop
loop
	slt r3,r2,r1
	bez r3,fim
	ldi r4,0x0a
	stw r4,0xf000
	stw r2,x
	add r2,1
	ldw r3,x
	ldi r5,0
	bnz r7,print
print
	slt r4,r5,r3
	bez r4,loop
	ldi r4,0x2a
	stw r4,0xf000
	add r5,1
	bnz r7,print
fim
	hcf
len	10
x	1
