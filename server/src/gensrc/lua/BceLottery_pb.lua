-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceLottery_pb', package.seeall)


local BCELOTTERY = protobuf.Descriptor();
local BCELOTTERY_IDX_FIELD = protobuf.FieldDescriptor();
local BCELOTTERY_ID_FIELD = protobuf.FieldDescriptor();
local BCELOTTERY_ISPVE_FIELD = protobuf.FieldDescriptor();
local BCELOTTERY_ISLOGIN_FIELD = protobuf.FieldDescriptor();
local BCELOTTERY_ISGUIDE_FIELD = protobuf.FieldDescriptor();

BCELOTTERY_IDX_FIELD.name = "idx"
BCELOTTERY_IDX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceLottery.idx"
BCELOTTERY_IDX_FIELD.number = 1
BCELOTTERY_IDX_FIELD.index = 0
BCELOTTERY_IDX_FIELD.label = 2
BCELOTTERY_IDX_FIELD.has_default_value = false
BCELOTTERY_IDX_FIELD.default_value = 0
BCELOTTERY_IDX_FIELD.type = 5
BCELOTTERY_IDX_FIELD.cpp_type = 1

BCELOTTERY_ID_FIELD.name = "id"
BCELOTTERY_ID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceLottery.id"
BCELOTTERY_ID_FIELD.number = 2
BCELOTTERY_ID_FIELD.index = 1
BCELOTTERY_ID_FIELD.label = 1
BCELOTTERY_ID_FIELD.has_default_value = false
BCELOTTERY_ID_FIELD.default_value = ""
BCELOTTERY_ID_FIELD.type = 9
BCELOTTERY_ID_FIELD.cpp_type = 9

BCELOTTERY_ISPVE_FIELD.name = "isPVE"
BCELOTTERY_ISPVE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceLottery.isPVE"
BCELOTTERY_ISPVE_FIELD.number = 3
BCELOTTERY_ISPVE_FIELD.index = 2
BCELOTTERY_ISPVE_FIELD.label = 1
BCELOTTERY_ISPVE_FIELD.has_default_value = true
BCELOTTERY_ISPVE_FIELD.default_value = false
BCELOTTERY_ISPVE_FIELD.type = 8
BCELOTTERY_ISPVE_FIELD.cpp_type = 7

BCELOTTERY_ISLOGIN_FIELD.name = "isLogin"
BCELOTTERY_ISLOGIN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceLottery.isLogin"
BCELOTTERY_ISLOGIN_FIELD.number = 4
BCELOTTERY_ISLOGIN_FIELD.index = 3
BCELOTTERY_ISLOGIN_FIELD.label = 1
BCELOTTERY_ISLOGIN_FIELD.has_default_value = true
BCELOTTERY_ISLOGIN_FIELD.default_value = false
BCELOTTERY_ISLOGIN_FIELD.type = 8
BCELOTTERY_ISLOGIN_FIELD.cpp_type = 7

BCELOTTERY_ISGUIDE_FIELD.name = "isGuide"
BCELOTTERY_ISGUIDE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceLottery.isGuide"
BCELOTTERY_ISGUIDE_FIELD.number = 5
BCELOTTERY_ISGUIDE_FIELD.index = 4
BCELOTTERY_ISGUIDE_FIELD.label = 1
BCELOTTERY_ISGUIDE_FIELD.has_default_value = true
BCELOTTERY_ISGUIDE_FIELD.default_value = false
BCELOTTERY_ISGUIDE_FIELD.type = 8
BCELOTTERY_ISGUIDE_FIELD.cpp_type = 7

BCELOTTERY.name = "BceLottery"
BCELOTTERY.full_name = ".com.xinqihd.sns.gameserver.proto.BceLottery"
BCELOTTERY.nested_types = {}
BCELOTTERY.enum_types = {}
BCELOTTERY.fields = {BCELOTTERY_IDX_FIELD, BCELOTTERY_ID_FIELD, BCELOTTERY_ISPVE_FIELD, BCELOTTERY_ISLOGIN_FIELD, BCELOTTERY_ISGUIDE_FIELD}
BCELOTTERY.is_extendable = false
BCELOTTERY.extensions = {}

BceLottery = protobuf.Message(BCELOTTERY)
_G.BCELOTTERY_PB_BCELOTTERY = BCELOTTERY

