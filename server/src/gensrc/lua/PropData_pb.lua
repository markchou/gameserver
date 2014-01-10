-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('PropData_pb', package.seeall)


local PROPDATA = protobuf.Descriptor();
local PROPDATA_PROPID_FIELD = protobuf.FieldDescriptor();
local PROPDATA_PROPPEW_FIELD = protobuf.FieldDescriptor();
local PROPDATA_PROPINDATE_FIELD = protobuf.FieldDescriptor();
local PROPDATA_LEVEL_FIELD = protobuf.FieldDescriptor();
local PROPDATA_ATTACKLEV_FIELD = protobuf.FieldDescriptor();
local PROPDATA_DEFENDLEV_FIELD = protobuf.FieldDescriptor();
local PROPDATA_AGILITYLEV_FIELD = protobuf.FieldDescriptor();
local PROPDATA_LUCKLEV_FIELD = protobuf.FieldDescriptor();
local PROPDATA_COLOR_FIELD = protobuf.FieldDescriptor();
local PROPDATA_SIGN_FIELD = protobuf.FieldDescriptor();
local PROPDATA_COUNT_FIELD = protobuf.FieldDescriptor();
local PROPDATA_ID_FIELD = protobuf.FieldDescriptor();
local PROPDATA_TYPEID_FIELD = protobuf.FieldDescriptor();
local PROPDATA_VALUETYPE_FIELD = protobuf.FieldDescriptor();
local PROPDATA_BANDED_FIELD = protobuf.FieldDescriptor();
local PROPDATA_DURATION_FIELD = protobuf.FieldDescriptor();
local PROPDATA_DAMAGELEV_FIELD = protobuf.FieldDescriptor();
local PROPDATA_SKINLEV_FIELD = protobuf.FieldDescriptor();
local PROPDATA_POWER_FIELD = protobuf.FieldDescriptor();
local PROPDATA_BASEATTACK_FIELD = protobuf.FieldDescriptor();
local PROPDATA_BASEDEFEND_FIELD = protobuf.FieldDescriptor();
local PROPDATA_BASEAGILITY_FIELD = protobuf.FieldDescriptor();
local PROPDATA_BASELUCKY_FIELD = protobuf.FieldDescriptor();
local PROPDATA_BASEPOWER_FIELD = protobuf.FieldDescriptor();

PROPDATA_PROPID_FIELD.name = "propID"
PROPDATA_PROPID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.propID"
PROPDATA_PROPID_FIELD.number = 1
PROPDATA_PROPID_FIELD.index = 0
PROPDATA_PROPID_FIELD.label = 2
PROPDATA_PROPID_FIELD.has_default_value = false
PROPDATA_PROPID_FIELD.default_value = ""
PROPDATA_PROPID_FIELD.type = 9
PROPDATA_PROPID_FIELD.cpp_type = 9

PROPDATA_PROPPEW_FIELD.name = "propPew"
PROPDATA_PROPPEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.propPew"
PROPDATA_PROPPEW_FIELD.number = 2
PROPDATA_PROPPEW_FIELD.index = 1
PROPDATA_PROPPEW_FIELD.label = 2
PROPDATA_PROPPEW_FIELD.has_default_value = false
PROPDATA_PROPPEW_FIELD.default_value = 0
PROPDATA_PROPPEW_FIELD.type = 5
PROPDATA_PROPPEW_FIELD.cpp_type = 1

PROPDATA_PROPINDATE_FIELD.name = "propIndate"
PROPDATA_PROPINDATE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.propIndate"
PROPDATA_PROPINDATE_FIELD.number = 3
PROPDATA_PROPINDATE_FIELD.index = 2
PROPDATA_PROPINDATE_FIELD.label = 1
PROPDATA_PROPINDATE_FIELD.has_default_value = true
PROPDATA_PROPINDATE_FIELD.default_value = 30
PROPDATA_PROPINDATE_FIELD.type = 5
PROPDATA_PROPINDATE_FIELD.cpp_type = 1

PROPDATA_LEVEL_FIELD.name = "level"
PROPDATA_LEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.level"
PROPDATA_LEVEL_FIELD.number = 4
PROPDATA_LEVEL_FIELD.index = 3
PROPDATA_LEVEL_FIELD.label = 1
PROPDATA_LEVEL_FIELD.has_default_value = true
PROPDATA_LEVEL_FIELD.default_value = 0
PROPDATA_LEVEL_FIELD.type = 5
PROPDATA_LEVEL_FIELD.cpp_type = 1

PROPDATA_ATTACKLEV_FIELD.name = "attackLev"
PROPDATA_ATTACKLEV_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.attackLev"
PROPDATA_ATTACKLEV_FIELD.number = 5
PROPDATA_ATTACKLEV_FIELD.index = 4
PROPDATA_ATTACKLEV_FIELD.label = 1
PROPDATA_ATTACKLEV_FIELD.has_default_value = true
PROPDATA_ATTACKLEV_FIELD.default_value = 0
PROPDATA_ATTACKLEV_FIELD.type = 5
PROPDATA_ATTACKLEV_FIELD.cpp_type = 1

PROPDATA_DEFENDLEV_FIELD.name = "defendLev"
PROPDATA_DEFENDLEV_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.defendLev"
PROPDATA_DEFENDLEV_FIELD.number = 6
PROPDATA_DEFENDLEV_FIELD.index = 5
PROPDATA_DEFENDLEV_FIELD.label = 1
PROPDATA_DEFENDLEV_FIELD.has_default_value = true
PROPDATA_DEFENDLEV_FIELD.default_value = 0
PROPDATA_DEFENDLEV_FIELD.type = 5
PROPDATA_DEFENDLEV_FIELD.cpp_type = 1

PROPDATA_AGILITYLEV_FIELD.name = "agilityLev"
PROPDATA_AGILITYLEV_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.agilityLev"
PROPDATA_AGILITYLEV_FIELD.number = 7
PROPDATA_AGILITYLEV_FIELD.index = 6
PROPDATA_AGILITYLEV_FIELD.label = 1
PROPDATA_AGILITYLEV_FIELD.has_default_value = true
PROPDATA_AGILITYLEV_FIELD.default_value = 0
PROPDATA_AGILITYLEV_FIELD.type = 5
PROPDATA_AGILITYLEV_FIELD.cpp_type = 1

PROPDATA_LUCKLEV_FIELD.name = "luckLev"
PROPDATA_LUCKLEV_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.luckLev"
PROPDATA_LUCKLEV_FIELD.number = 8
PROPDATA_LUCKLEV_FIELD.index = 7
PROPDATA_LUCKLEV_FIELD.label = 1
PROPDATA_LUCKLEV_FIELD.has_default_value = true
PROPDATA_LUCKLEV_FIELD.default_value = 0
PROPDATA_LUCKLEV_FIELD.type = 5
PROPDATA_LUCKLEV_FIELD.cpp_type = 1

PROPDATA_COLOR_FIELD.name = "color"
PROPDATA_COLOR_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.color"
PROPDATA_COLOR_FIELD.number = 9
PROPDATA_COLOR_FIELD.index = 8
PROPDATA_COLOR_FIELD.label = 1
PROPDATA_COLOR_FIELD.has_default_value = true
PROPDATA_COLOR_FIELD.default_value = 0
PROPDATA_COLOR_FIELD.type = 5
PROPDATA_COLOR_FIELD.cpp_type = 1

PROPDATA_SIGN_FIELD.name = "sign"
PROPDATA_SIGN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.sign"
PROPDATA_SIGN_FIELD.number = 10
PROPDATA_SIGN_FIELD.index = 9
PROPDATA_SIGN_FIELD.label = 1
PROPDATA_SIGN_FIELD.has_default_value = true
PROPDATA_SIGN_FIELD.default_value = 0
PROPDATA_SIGN_FIELD.type = 5
PROPDATA_SIGN_FIELD.cpp_type = 1

PROPDATA_COUNT_FIELD.name = "count"
PROPDATA_COUNT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.count"
PROPDATA_COUNT_FIELD.number = 11
PROPDATA_COUNT_FIELD.index = 10
PROPDATA_COUNT_FIELD.label = 1
PROPDATA_COUNT_FIELD.has_default_value = true
PROPDATA_COUNT_FIELD.default_value = 1
PROPDATA_COUNT_FIELD.type = 5
PROPDATA_COUNT_FIELD.cpp_type = 1

PROPDATA_ID_FIELD.name = "id"
PROPDATA_ID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.id"
PROPDATA_ID_FIELD.number = 12
PROPDATA_ID_FIELD.index = 11
PROPDATA_ID_FIELD.label = 1
PROPDATA_ID_FIELD.has_default_value = false
PROPDATA_ID_FIELD.default_value = ""
PROPDATA_ID_FIELD.type = 9
PROPDATA_ID_FIELD.cpp_type = 9

PROPDATA_TYPEID_FIELD.name = "typeid"
PROPDATA_TYPEID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.typeid"
PROPDATA_TYPEID_FIELD.number = 13
PROPDATA_TYPEID_FIELD.index = 12
PROPDATA_TYPEID_FIELD.label = 1
PROPDATA_TYPEID_FIELD.has_default_value = true
PROPDATA_TYPEID_FIELD.default_value = "0"
PROPDATA_TYPEID_FIELD.type = 9
PROPDATA_TYPEID_FIELD.cpp_type = 9

PROPDATA_VALUETYPE_FIELD.name = "valuetype"
PROPDATA_VALUETYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.valuetype"
PROPDATA_VALUETYPE_FIELD.number = 14
PROPDATA_VALUETYPE_FIELD.index = 13
PROPDATA_VALUETYPE_FIELD.label = 1
PROPDATA_VALUETYPE_FIELD.has_default_value = true
PROPDATA_VALUETYPE_FIELD.default_value = 0
PROPDATA_VALUETYPE_FIELD.type = 5
PROPDATA_VALUETYPE_FIELD.cpp_type = 1

PROPDATA_BANDED_FIELD.name = "banded"
PROPDATA_BANDED_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.banded"
PROPDATA_BANDED_FIELD.number = 15
PROPDATA_BANDED_FIELD.index = 14
PROPDATA_BANDED_FIELD.label = 1
PROPDATA_BANDED_FIELD.has_default_value = true
PROPDATA_BANDED_FIELD.default_value = false
PROPDATA_BANDED_FIELD.type = 8
PROPDATA_BANDED_FIELD.cpp_type = 7

PROPDATA_DURATION_FIELD.name = "duration"
PROPDATA_DURATION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.duration"
PROPDATA_DURATION_FIELD.number = 16
PROPDATA_DURATION_FIELD.index = 15
PROPDATA_DURATION_FIELD.label = 1
PROPDATA_DURATION_FIELD.has_default_value = true
PROPDATA_DURATION_FIELD.default_value = 0
PROPDATA_DURATION_FIELD.type = 5
PROPDATA_DURATION_FIELD.cpp_type = 1

PROPDATA_DAMAGELEV_FIELD.name = "damageLev"
PROPDATA_DAMAGELEV_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.damageLev"
PROPDATA_DAMAGELEV_FIELD.number = 17
PROPDATA_DAMAGELEV_FIELD.index = 16
PROPDATA_DAMAGELEV_FIELD.label = 1
PROPDATA_DAMAGELEV_FIELD.has_default_value = true
PROPDATA_DAMAGELEV_FIELD.default_value = 0
PROPDATA_DAMAGELEV_FIELD.type = 5
PROPDATA_DAMAGELEV_FIELD.cpp_type = 1

PROPDATA_SKINLEV_FIELD.name = "skinLev"
PROPDATA_SKINLEV_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.skinLev"
PROPDATA_SKINLEV_FIELD.number = 18
PROPDATA_SKINLEV_FIELD.index = 17
PROPDATA_SKINLEV_FIELD.label = 1
PROPDATA_SKINLEV_FIELD.has_default_value = true
PROPDATA_SKINLEV_FIELD.default_value = 0
PROPDATA_SKINLEV_FIELD.type = 5
PROPDATA_SKINLEV_FIELD.cpp_type = 1

PROPDATA_POWER_FIELD.name = "power"
PROPDATA_POWER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.power"
PROPDATA_POWER_FIELD.number = 19
PROPDATA_POWER_FIELD.index = 18
PROPDATA_POWER_FIELD.label = 1
PROPDATA_POWER_FIELD.has_default_value = true
PROPDATA_POWER_FIELD.default_value = 0
PROPDATA_POWER_FIELD.type = 5
PROPDATA_POWER_FIELD.cpp_type = 1

PROPDATA_BASEATTACK_FIELD.name = "baseAttack"
PROPDATA_BASEATTACK_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.baseAttack"
PROPDATA_BASEATTACK_FIELD.number = 20
PROPDATA_BASEATTACK_FIELD.index = 19
PROPDATA_BASEATTACK_FIELD.label = 1
PROPDATA_BASEATTACK_FIELD.has_default_value = true
PROPDATA_BASEATTACK_FIELD.default_value = 0
PROPDATA_BASEATTACK_FIELD.type = 5
PROPDATA_BASEATTACK_FIELD.cpp_type = 1

PROPDATA_BASEDEFEND_FIELD.name = "baseDefend"
PROPDATA_BASEDEFEND_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.baseDefend"
PROPDATA_BASEDEFEND_FIELD.number = 21
PROPDATA_BASEDEFEND_FIELD.index = 20
PROPDATA_BASEDEFEND_FIELD.label = 1
PROPDATA_BASEDEFEND_FIELD.has_default_value = true
PROPDATA_BASEDEFEND_FIELD.default_value = 0
PROPDATA_BASEDEFEND_FIELD.type = 5
PROPDATA_BASEDEFEND_FIELD.cpp_type = 1

PROPDATA_BASEAGILITY_FIELD.name = "baseAgility"
PROPDATA_BASEAGILITY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.baseAgility"
PROPDATA_BASEAGILITY_FIELD.number = 22
PROPDATA_BASEAGILITY_FIELD.index = 21
PROPDATA_BASEAGILITY_FIELD.label = 1
PROPDATA_BASEAGILITY_FIELD.has_default_value = true
PROPDATA_BASEAGILITY_FIELD.default_value = 0
PROPDATA_BASEAGILITY_FIELD.type = 5
PROPDATA_BASEAGILITY_FIELD.cpp_type = 1

PROPDATA_BASELUCKY_FIELD.name = "baseLucky"
PROPDATA_BASELUCKY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.baseLucky"
PROPDATA_BASELUCKY_FIELD.number = 23
PROPDATA_BASELUCKY_FIELD.index = 22
PROPDATA_BASELUCKY_FIELD.label = 1
PROPDATA_BASELUCKY_FIELD.has_default_value = true
PROPDATA_BASELUCKY_FIELD.default_value = 0
PROPDATA_BASELUCKY_FIELD.type = 5
PROPDATA_BASELUCKY_FIELD.cpp_type = 1

PROPDATA_BASEPOWER_FIELD.name = "basePower"
PROPDATA_BASEPOWER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropData.basePower"
PROPDATA_BASEPOWER_FIELD.number = 24
PROPDATA_BASEPOWER_FIELD.index = 23
PROPDATA_BASEPOWER_FIELD.label = 1
PROPDATA_BASEPOWER_FIELD.has_default_value = true
PROPDATA_BASEPOWER_FIELD.default_value = 0
PROPDATA_BASEPOWER_FIELD.type = 5
PROPDATA_BASEPOWER_FIELD.cpp_type = 1

PROPDATA.name = "PropData"
PROPDATA.full_name = ".com.xinqihd.sns.gameserver.proto.PropData"
PROPDATA.nested_types = {}
PROPDATA.enum_types = {}
PROPDATA.fields = {PROPDATA_PROPID_FIELD, PROPDATA_PROPPEW_FIELD, PROPDATA_PROPINDATE_FIELD, PROPDATA_LEVEL_FIELD, PROPDATA_ATTACKLEV_FIELD, PROPDATA_DEFENDLEV_FIELD, PROPDATA_AGILITYLEV_FIELD, PROPDATA_LUCKLEV_FIELD, PROPDATA_COLOR_FIELD, PROPDATA_SIGN_FIELD, PROPDATA_COUNT_FIELD, PROPDATA_ID_FIELD, PROPDATA_TYPEID_FIELD, PROPDATA_VALUETYPE_FIELD, PROPDATA_BANDED_FIELD, PROPDATA_DURATION_FIELD, PROPDATA_DAMAGELEV_FIELD, PROPDATA_SKINLEV_FIELD, PROPDATA_POWER_FIELD, PROPDATA_BASEATTACK_FIELD, PROPDATA_BASEDEFEND_FIELD, PROPDATA_BASEAGILITY_FIELD, PROPDATA_BASELUCKY_FIELD, PROPDATA_BASEPOWER_FIELD}
PROPDATA.is_extendable = false
PROPDATA.extensions = {}

PropData = protobuf.Message(PROPDATA)
_G.PROPDATA_PB_PROPDATA = PROPDATA
