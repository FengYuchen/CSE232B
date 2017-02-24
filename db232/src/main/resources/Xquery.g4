/*
    Author: Yuchen Feng
    Date: 1-25-2017
*/

grammar Xquery;


xq
    : '$' var       # XQVariable
    | StringConst   # XQStringConst
    | ap            # XQAp
    | '(' xq ')'    # XQPar
    | xq '/' rp     # XQChild
    | xq '//' rp    # XQAll
    | xq ',' xq     # XQDot
    | '<' NAME '>' '{' xq '}' '<' '/' NAME '>'      # XQTag
    | forClause letClause? whereClause? returnClause        #FLWR

    | letClause xq      #XQLet
    ;

var
    : NAME
    ;

forClause
    : 'for' '$' var 'in' xq (',' '$' var 'in' xq)*
    ;

letClause
    : 'let' '$' var ':=' xq (',' '$' var ':=' xq)*
    ;

whereClause
    : 'where' cond
    ;

returnClause
    : 'return' xq
    ;

cond
    : xq '=' xq         #XQCondEqual
    | xq 'eq' xq        #XQCondEqual
    | xq '==' xq        #XQCondIs
    | xq 'is' xq        #XQCondIs
    | 'empty' '(' xq ')'    #XQCondEmpty
    | 'some' '$' var 'in' xq (',' '$' var 'in' xq)* 'satisfies' cond    #XQCondSome
    | '(' cond ')'      #XQCondPar
    | cond 'and' cond   #XQCondAnd
    | cond 'or' cond    #XQCondOr
    | 'not' cond        #XQCondNot
    ;

StringConst
    : '"'+[a-zA-Z0-9,.!?; ''""-]+'"'
    ;

ap
	: 'doc("' fname '"' ')' '/' rp 		# APChildren
	| 'doc("' fname '"' ')' '//' rp		# APAll
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