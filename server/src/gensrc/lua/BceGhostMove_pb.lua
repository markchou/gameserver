-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGhostMove_pb', package.seeall)


local BCEGHOSTMOVE = protobuf.Descriptor();
local BCEGHOSTMOVE_X_FIELD = protobuf.FieldDescriptor();
local BCEGHOSTMOVE_Y_FIELD = protobuf.FieldDescriptor();

BCEGHOSTMOVE_X_FIELD.name = "x"
BCEGHOSTMOVE_X_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGhostMove.x"
BCEGHOSTMOVE_X_FIELD.number = 1
BCEGHOSTMOVE_X_FIELD.index = 0
BCEGHOSTMOVE_X_FIELD.label = 2
BCEGHOSTMOVE_X_FIELD.has_default_value = false
BCEGHOSTMOVE_X_FIELD.default_value = 0
BCEGHOSTMOVE_X_FIELD.type = 5
BCEGHOSTMOVE_X_FIELD.cpp_type = 1

BCEGHOSTMOVE_Y_FIELD.name = "y"
BCEGHOSTMOVE_Y_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGhostMove.y"
BCEGHOSTMOVE_Y_FIELD.number = 2
BCEGHOSTMOVE_Y_FIELD.index = 1
BCEGHOSTMOVE_Y_FIELD.label = 2
BCEGHOSTMOVE_Y_FIELD.has_default_value = false
BCEGHOSTMOVE_Y_FIELD.default_value = 0
BCEGHOSTMOVE_Y_FIELD.type = 5
BCEGHOSTMOVE_Y_FIELD.cpp_type = 1

BCEGHOSTMOVE.name = "BceGhostMove"
BCEGHOSTMOVE.full_name = ".com.xinqihd.sns.gameserver.proto.BceGhostMove"
BCEGHOSTMOVE.nested_types = {}
BCEGHOSTMOVE.enum_types = {}
BCEGHOSTMOVE.fields = {BCEGHOSTMOVE_X_FIELD, BCEGHOSTMOVE_Y_FIELD}
BCEGHOSTMOVE.is_extendable = false
BCEGHOSTMOVE.extensions = {}

BceGhostMove = protobuf.Message(BCEGHOSTMOVE)
_G.BCEGHOSTMOVE_PB_BCEGHOSTMOVE = BCEGHOSTMOVE
