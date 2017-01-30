/*
    Author: Yuchen Feng
    Date: 1-25-2017
*/

grammar Xquery;

ap
	: 'document("' fname '"' ')' '/' rp 		# APChildren
	| 'document("' fname '"' ')' '//' rp		# APAll
	;

fname
	:  NAME ('.' NAME)?
	;

rp
	: NAME 				# TagName
	| '@' NAME 			# Attribute
	| '*' 				# AllChildren
	| '.' 				# Current
	| '..' 				# Parent
	| TXT 				# Text
	| '(' rp ')' 		# RPwithPar
	| rp '/' rp 		# RPChildren
	| rp '//' rp 		# RPAll
	| rp '[' fltr ']' 	# RPCondition
	| rp ',' rp 		# TwoRP
	;

fltr
	: rp 				# FRP
	| rp '=' rp 		# FRPequal
	| rp 'eq' rp 		# FRPequal
	| rp '==' rp 		# FRPis
	| rp 'is' rp 		# FRPis
	| '(' fltr ')' 		# FRPwithPar
	| fltr 'and' fltr 	# FRPand
	| fltr 'or' fltr 	# FRPor
	| 'not' fltr 		# FRPnot
	;

TXT:	'text()';
NAME:	[a-zA-Z0-9_-]+;
WS  :   [ \t\r\n]+ -> skip;