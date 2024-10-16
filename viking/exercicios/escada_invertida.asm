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
	sub r3,r1,r3
	ldi r5,0
	bnz r7,print
print
	slt r4,r5,r1
	bez r4,loop
	add r5,1
	slt r4,r5,r3
	bez r4,star
	ldi r4,0x20
	stw r4,0xf000
	bnz r7,print
star
	ldi r4,0x2a
	stw r4,0xf000
	bnz r7,print
fim
	hcf
len	10
x	0
