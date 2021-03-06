-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceSelectRole_pb', package.seeall)


local BCESELECTROLE = protobuf.Descriptor();
local BCESELECTROLE_USERID_FIELD = protobuf.FieldDescriptor();
local BCESELECTROLE_SERVERID_FIELD = protobuf.FieldDescriptor();
local BCESELECTROLE_UUID_FIELD = protobuf.FieldDescriptor();
local BCESELECTROLE_SCREEN_FIELD = protobuf.FieldDescriptor();
local BCESELECTROLE_DEVICETOKEN_FIELD = protobuf.FieldDescriptor();
local BCESELECTROLE_CLIENT_FIELD = protobuf.FieldDescriptor();
local BCESELECTROLE_LANG_FIELD = protobuf.FieldDescriptor();
local BCESELECTROLE_TOKEN_FIELD = protobuf.FieldDescriptor();

BCESELECTROLE_USERID_FIELD.name = "userid"
BCESELECTROLE_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSelectRole.userid"
BCESELECTROLE_USERID_FIELD.number = 1
BCESELECTROLE_USERID_FIELD.index = 0
BCESELECTROLE_USERID_FIELD.label = 1
BCESELECTROLE_USERID_FIELD.has_default_value = false
BCESELECTROLE_USERID_FIELD.default_value = ""
BCESELECTROLE_USERID_FIELD.type = 9
BCESELECTROLE_USERID_FIELD.cpp_type = 9

BCESELECTROLE_SERVERID_FIELD.name = "serverid"
BCESELECTROLE_SERVERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSelectRole.serverid"
BCESELECTROLE_SERVERID_FIELD.number = 2
BCESELECTROLE_SERVERID_FIELD.index = 1
BCESELECTROLE_SERVERID_FIELD.label = 1
BCESELECTROLE_SERVERID_FIELD.has_default_value = false
BCESELECTROLE_SERVERID_FIELD.default_value = ""
BCESELECTROLE_SERVERID_FIELD.type = 9
BCESELECTROLE_SERVERID_FIELD.cpp_type = 9

BCESELECTROLE_UUID_FIELD.name = "uuid"
BCESELECTROLE_UUID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSelectRole.uuid"
BCESELECTROLE_UUID_FIELD.number = 3
BCESELECTROLE_UUID_FIELD.index = 2
BCESELECTROLE_UUID_FIELD.label = 1
BCESELECTROLE_UUID_FIELD.has_default_value = false
BCESELECTROLE_UUID_FIELD.default_value = ""
BCESELECTROLE_UUID_FIELD.type = 9
BCESELECTROLE_UUID_FIELD.cpp_type = 9

BCESELECTROLE_SCREEN_FIELD.name = "screen"
BCESELECTROLE_SCREEN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSelectRole.screen"
BCESELECTROLE_SCREEN_FIELD.number = 4
BCESELECTROLE_SCREEN_FIELD.index = 3
BCESELECTROLE_SCREEN_FIELD.label = 1
BCESELECTROLE_SCREEN_FIELD.has_default_value = false
BCESELECTROLE_SCREEN_FIELD.default_value = ""
BCESELECTROLE_SCREEN_FIELD.type = 9
BCESELECTROLE_SCREEN_FIELD.cpp_type = 9

BCESELECTROLE_DEVICETOKEN_FIELD.name = "devicetoken"
BCESELECTROLE_DEVICETOKEN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSelectRole.devicetoken"
BCESELECTROLE_DEVICETOKEN_FIELD.number = 5
BCESELECTROLE_DEVICETOKEN_FIELD.index = 4
BCESELECTROLE_DEVICETOKEN_FIELD.label = 1
BCESELECTROLE_DEVICETOKEN_FIELD.has_default_value = false
BCESELECTROLE_DEVICETOKEN_FIELD.default_value = ""
BCESELECTROLE_DEVICETOKEN_FIELD.type = 9
BCESELECTROLE_DEVICETOKEN_FIELD.cpp_type = 9

BCESELECTROLE_CLIENT_FIELD.name = "client"
BCESELECTROLE_CLIENT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSelectRole.client"
BCESELECTROLE_CLIENT_FIELD.number = 6
BCESELECTROLE_CLIENT_FIELD.index = 5
BCESELECTROLE_CLIENT_FIELD.label = 1
BCESELECTROLE_CLIENT_FIELD.has_default_value = false
BCESELECTROLE_CLIENT_FIELD.default_value = ""
BCESELECTROLE_CLIENT_FIELD.type = 9
BCESELECTROLE_CLIENT_FIELD.cpp_type = 9

BCESELECTROLE_LANG_FIELD.name = "lang"
BCESELECTROLE_LANG_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSelectRole.lang"
BCESELECTROLE_LANG_FIELD.number = 7
BCESELECTROLE_LANG_FIELD.index = 6
BCESELECTROLE_LANG_FIELD.label = 1
BCESELECTROLE_LANG_FIELD.has_default_value = false
BCESELECTROLE_LANG_FIELD.default_value = ""
BCESELECTROLE_LANG_FIELD.type = 9
BCESELECTROLE_LANG_FIELD.cpp_type = 9

BCESELECTROLE_TOKEN_FIELD.name = "token"
BCESELECTROLE_TOKEN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceSelectRole.token"
BCESELECTROLE_TOKEN_FIELD.number = 8
BCESELECTROLE_TOKEN_FIELD.index = 7
BCESELECTROLE_TOKEN_FIELD.label = 1
BCESELECTROLE_TOKEN_FIELD.has_default_value = false
BCESELECTROLE_TOKEN_FIELD.default_value = ""
BCESELECTROLE_TOKEN_FIELD.type = 9
BCESELECTROLE_TOKEN_FIELD.cpp_type = 9

BCESELECTROLE.name = "BceSelectRole"
BCESELECTROLE.full_name = ".com.xinqihd.sns.gameserver.proto.BceSelectRole"
BCESELECTROLE.nested_types = {}
BCESELECTROLE.enum_types = {}
BCESELECTROLE.fields = {BCESELECTROLE_USERID_FIELD, BCESELECTROLE_SERVERID_FIELD, BCESELECTROLE_UUID_FIELD, BCESELECTROLE_SCREEN_FIELD, BCESELECTROLE_DEVICETOKEN_FIELD, BCESELECTROLE_CLIENT_FIELD, BCESELECTROLE_LANG_FIELD, BCESELECTROLE_TOKEN_FIELD}
BCESELECTROLE.is_extendable = false
BCESELECTROLE.extensions = {}

BceSelectRole = protobuf.Message(BCESELECTROLE)
_G.BCESELECTROLE_PB_BCESELECTROLE = BCESELECTROLE

