/*
    Author: Yuchen Feng
    Date: 1-25-2017
*/

grammar Xquery;

ap
	: '<' NAME '>' '{' ap '}' '<' '/' NAME '>'  # APTag
	| 'document("' fname '"' ')' '/' rp 		# APChildren
	| 'document("' fname '"' ')' '//' rp		# APAll
	;

fname
	:  NAME ('.' NAME)?
	;

rp
	: NAME 				# RPTagName
	| '@' NAME 			# RPAttribute
	| '*' 				# RPAllChildren
	| '.' 				# RPCurrent
	| '..' 				# RPParent
	| TXT 				# Text
	| '(' rp ')' 		# RPPar
	| rp '/' rp 		# RPChild
	| rp '//' rp 		# RPAll
	| rp '[' func ']' 	# RPCond
	| rp ',' rp 		# RPDot
	;

func
	: rp 				# F
	| rp '=' rp 		# Fequal
	| rp 'eq' rp 		# Fequal
	| rp '==' rp 		# Fis
	| rp 'is' rp 		# Fis
	| '(' func ')' 		# FPar
	| func 'and' func 	# Fand
	| func 'or' func 	# For
	| 'not' func 		# Fnot
	;

TXT:	'text()';
NAME:	[a-zA-Z0-9_-]+;
WS  :   [ \t\r\n]+ -> skip;