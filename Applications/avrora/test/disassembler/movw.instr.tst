; @Harness: disassembler
; @Result: PASS
  section .text  size=0x00000040 vma=0x00000000 lma=0x00000000 offset=0x00000034 ;2**0 
  section .data  size=0x00000000 vma=0x00000000 lma=0x00000000 offset=0x00000074 ;2**0 

start .text:

label 0x00000000  ".text":
      0x0: 0x00 0x01  movw  r0,  r0
      0x2: 0x10 0x01  movw  r2,  r0
      0x4: 0x20 0x01  movw  r4,  r0
      0x6: 0x30 0x01  movw  r6,  r0
      0x8: 0x40 0x01  movw  r8,  r0
      0xa: 0x50 0x01  movw  r10,  r0
      0xc: 0x60 0x01  movw  r12,  r0
      0xe: 0x70 0x01  movw  r14,  r0
     0x10: 0x80 0x01  movw  r16,  r0
     0x12: 0x90 0x01  movw  r18,  r0
     0x14: 0xa0 0x01  movw  r20,  r0
     0x16: 0xb0 0x01  movw  r22,  r0
     0x18: 0xc0 0x01  movw  r24,  r0
     0x1a: 0xd0 0x01  movw  r26,  r0
     0x1c: 0xe0 0x01  movw  r28,  r0
     0x1e: 0xf0 0x01  movw  r30,  r0
     0x20: 0x00 0x01  movw  r0,  r0
     0x22: 0x01 0x01  movw  r0,  r2
     0x24: 0x02 0x01  movw  r0,  r4
     0x26: 0x03 0x01  movw  r0,  r6
     0x28: 0x04 0x01  movw  r0,  r8
     0x2a: 0x05 0x01  movw  r0,  r10
     0x2c: 0x06 0x01  movw  r0,  r12
     0x2e: 0x07 0x01  movw  r0,  r14
     0x30: 0x08 0x01  movw  r0,  r16
     0x32: 0x09 0x01  movw  r0,  r18
     0x34: 0x0a 0x01  movw  r0,  r20
     0x36: 0x0b 0x01  movw  r0,  r22
     0x38: 0x0c 0x01  movw  r0,  r24
     0x3a: 0x0d 0x01  movw  r0,  r26
     0x3c: 0x0e 0x01  movw  r0,  r28
     0x3e: 0x0f 0x01  movw  r0,  r30

start .data:

