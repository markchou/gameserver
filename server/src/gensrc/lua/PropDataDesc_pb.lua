-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('PropDataDesc_pb', package.seeall)


local PROPDATADESC = protobuf.Descriptor();
local PROPDATADESC_ID_FIELD = protobuf.FieldDescriptor();
local PROPDATADESC_COLOR_FIELD = protobuf.FieldDescriptor();
local PROPDATADESC_NAME_FIELD = protobuf.FieldDescriptor();
local PROPDATADESC_ICON_FIELD = protobuf.FieldDescriptor();
local PROPDATADESC_QUALITY_FIELD = protobuf.FieldDescriptor();
local PROPDATADESC_DESC_FIELD = protobuf.FieldDescriptor();
local PROPDATADESC_LEVEL_FIELD = protobuf.FieldDescriptor();
local PROPDATADESC_DURATION_FIELD = protobuf.FieldDescriptor();

PROPDATADESC_ID_FIELD.name = "id"
PROPDATADESC_ID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropDataDesc.id"
PROPDATADESC_ID_FIELD.number = 1
PROPDATADESC_ID_FIELD.index = 0
PROPDATADESC_ID_FIELD.label = 1
PROPDATADESC_ID_FIELD.has_default_value = false
PROPDATADESC_ID_FIELD.default_value = ""
PROPDATADESC_ID_FIELD.type = 9
PROPDATADESC_ID_FIELD.cpp_type = 9

PROPDATADESC_COLOR_FIELD.name = "color"
PROPDATADESC_COLOR_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropDataDesc.color"
PROPDATADESC_COLOR_FIELD.number = 2
PROPDATADESC_COLOR_FIELD.index = 1
PROPDATADESC_COLOR_FIELD.label = 1
PROPDATADESC_COLOR_FIELD.has_default_value = false
PROPDATADESC_COLOR_FIELD.default_value = 0
PROPDATADESC_COLOR_FIELD.type = 5
PROPDATADESC_COLOR_FIELD.cpp_type = 1

PROPDATADESC_NAME_FIELD.name = "name"
PROPDATADESC_NAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropDataDesc.name"
PROPDATADESC_NAME_FIELD.number = 3
PROPDATADESC_NAME_FIELD.index = 2
PROPDATADESC_NAME_FIELD.label = 1
PROPDATADESC_NAME_FIELD.has_default_value = false
PROPDATADESC_NAME_FIELD.default_value = ""
PROPDATADESC_NAME_FIELD.type = 9
PROPDATADESC_NAME_FIELD.cpp_type = 9

PROPDATADESC_ICON_FIELD.name = "icon"
PROPDATADESC_ICON_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropDataDesc.icon"
PROPDATADESC_ICON_FIELD.number = 4
PROPDATADESC_ICON_FIELD.index = 3
PROPDATADESC_ICON_FIELD.label = 1
PROPDATADESC_ICON_FIELD.has_default_value = false
PROPDATADESC_ICON_FIELD.default_value = ""
PROPDATADESC_ICON_FIELD.type = 9
PROPDATADESC_ICON_FIELD.cpp_type = 9

PROPDATADESC_QUALITY_FIELD.name = "quality"
PROPDATADESC_QUALITY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropDataDesc.quality"
PROPDATADESC_QUALITY_FIELD.number = 5
PROPDATADESC_QUALITY_FIELD.index = 4
PROPDATADESC_QUALITY_FIELD.label = 1
PROPDATADESC_QUALITY_FIELD.has_default_value = false
PROPDATADESC_QUALITY_FIELD.default_value = 0
PROPDATADESC_QUALITY_FIELD.type = 5
PROPDATADESC_QUALITY_FIELD.cpp_type = 1

PROPDATADESC_DESC_FIELD.name = "desc"
PROPDATADESC_DESC_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropDataDesc.desc"
PROPDATADESC_DESC_FIELD.number = 8
PROPDATADESC_DESC_FIELD.index = 5
PROPDATADESC_DESC_FIELD.label = 3
PROPDATADESC_DESC_FIELD.has_default_value = false
PROPDATADESC_DESC_FIELD.default_value = {}
PROPDATADESC_DESC_FIELD.type = 9
PROPDATADESC_DESC_FIELD.cpp_type = 9

PROPDATADESC_LEVEL_FIELD.name = "level"
PROPDATADESC_LEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropDataDesc.level"
PROPDATADESC_LEVEL_FIELD.number = 9
PROPDATADESC_LEVEL_FIELD.index = 6
PROPDATADESC_LEVEL_FIELD.label = 1
PROPDATADESC_LEVEL_FIELD.has_default_value = true
PROPDATADESC_LEVEL_FIELD.default_value = 0
PROPDATADESC_LEVEL_FIELD.type = 5
PROPDATADESC_LEVEL_FIELD.cpp_type = 1

PROPDATADESC_DURATION_FIELD.name = "duration"
PROPDATADESC_DURATION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.PropDataDesc.duration"
PROPDATADESC_DURATION_FIELD.number = 10
PROPDATADESC_DURATION_FIELD.index = 7
PROPDATADESC_DURATION_FIELD.label = 1
PROPDATADESC_DURATION_FIELD.has_default_value = true
PROPDATADESC_DURATION_FIELD.default_value = 0
PROPDATADESC_DURATION_FIELD.type = 5
PROPDATADESC_DURATION_FIELD.cpp_type = 1

PROPDATADESC.name = "PropDataDesc"
PROPDATADESC.full_name = ".com.xinqihd.sns.gameserver.proto.PropDataDesc"
PROPDATADESC.nested_types = {}
PROPDATADESC.enum_types = {}
PROPDATADESC.fields = {PROPDATADESC_ID_FIELD, PROPDATADESC_COLOR_FIELD, PROPDATADESC_NAME_FIELD, PROPDATADESC_ICON_FIELD, PROPDATADESC_QUALITY_FIELD, PROPDATADESC_DESC_FIELD, PROPDATADESC_LEVEL_FIELD, PROPDATADESC_DURATION_FIELD}
PROPDATADESC.is_extendable = false
PROPDATADESC.extensions = {}

PropDataDesc = protobuf.Message(PROPDATADESC)
_G.PROPDATADESC_PB_PROPDATADESC = PROPDATADESC

