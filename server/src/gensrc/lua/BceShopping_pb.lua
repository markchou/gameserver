-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceShopping_pb', package.seeall)


local BCESHOPPING = protobuf.Descriptor();
local BCESHOPPING_GENDER_FIELD = protobuf.FieldDescriptor();
local BCESHOPPING_MONEYTYPE_FIELD = protobuf.FieldDescriptor();
local BCESHOPPING_CATALOGID_FIELD = protobuf.FieldDescriptor();
local BCESHOPPING_STONETYPE_FIELD = protobuf.FieldDescriptor();

BCESHOPPING_GENDER_FIELD.name = "gender"
BCESHOPPING_GENDER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceShopping.gender"
BCESHOPPING_GENDER_FIELD.number = 1
BCESHOPPING_GENDER_FIELD.index = 0
BCESHOPPING_GENDER_FIELD.label = 1
BCESHOPPING_GENDER_FIELD.has_default_value = false
BCESHOPPING_GENDER_FIELD.default_value = 0
BCESHOPPING_GENDER_FIELD.type = 5
BCESHOPPING_GENDER_FIELD.cpp_type = 1

BCESHOPPING_MONEYTYPE_FIELD.name = "moneytype"
BCESHOPPING_MONEYTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceShopping.moneytype"
BCESHOPPING_MONEYTYPE_FIELD.number = 2
BCESHOPPING_MONEYTYPE_FIELD.index = 1
BCESHOPPING_MONEYTYPE_FIELD.label = 1
BCESHOPPING_MONEYTYPE_FIELD.has_default_value = false
BCESHOPPING_MONEYTYPE_FIELD.default_value = 0
BCESHOPPING_MONEYTYPE_FIELD.type = 5
BCESHOPPING_MONEYTYPE_FIELD.cpp_type = 1

BCESHOPPING_CATALOGID_FIELD.name = "catalogid"
BCESHOPPING_CATALOGID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceShopping.catalogid"
BCESHOPPING_CATALOGID_FIELD.number = 3
BCESHOPPING_CATALOGID_FIELD.index = 2
BCESHOPPING_CATALOGID_FIELD.label = 1
BCESHOPPING_CATALOGID_FIELD.has_default_value = false
BCESHOPPING_CATALOGID_FIELD.default_value = 0
BCESHOPPING_CATALOGID_FIELD.type = 5
BCESHOPPING_CATALOGID_FIELD.cpp_type = 1

BCESHOPPING_STONETYPE_FIELD.name = "stoneType"
BCESHOPPING_STONETYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceShopping.stoneType"
BCESHOPPING_STONETYPE_FIELD.number = 4
BCESHOPPING_STONETYPE_FIELD.index = 3
BCESHOPPING_STONETYPE_FIELD.label = 3
BCESHOPPING_STONETYPE_FIELD.has_default_value = false
BCESHOPPING_STONETYPE_FIELD.default_value = {}
BCESHOPPING_STONETYPE_FIELD.type = 5
BCESHOPPING_STONETYPE_FIELD.cpp_type = 1

BCESHOPPING.name = "BceShopping"
BCESHOPPING.full_name = ".com.xinqihd.sns.gameserver.proto.BceShopping"
BCESHOPPING.nested_types = {}
BCESHOPPING.enum_types = {}
BCESHOPPING.fields = {BCESHOPPING_GENDER_FIELD, BCESHOPPING_MONEYTYPE_FIELD, BCESHOPPING_CATALOGID_FIELD, BCESHOPPING_STONETYPE_FIELD}
BCESHOPPING.is_extendable = false
BCESHOPPING.extensions = {}

BceShopping = protobuf.Message(BCESHOPPING)
_G.BCESHOPPING_PB_BCESHOPPING = BCESHOPPING

