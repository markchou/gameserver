-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceBullet_pb', package.seeall)


local BCEBULLET = protobuf.Descriptor();
local BCEBULLET_UID_FIELD = protobuf.FieldDescriptor();
local BCEBULLET_BLTX_FIELD = protobuf.FieldDescriptor();
local BCEBULLET_BLTY_FIELD = protobuf.FieldDescriptor();

BCEBULLET_UID_FIELD.name = "uid"
BCEBULLET_UID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceBullet.uid"
BCEBULLET_UID_FIELD.number = 1
BCEBULLET_UID_FIELD.index = 0
BCEBULLET_UID_FIELD.label = 2
BCEBULLET_UID_FIELD.has_default_value = false
BCEBULLET_UID_FIELD.default_value = ""
BCEBULLET_UID_FIELD.type = 9
BCEBULLET_UID_FIELD.cpp_type = 9

BCEBULLET_BLTX_FIELD.name = "bltx"
BCEBULLET_BLTX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceBullet.bltx"
BCEBULLET_BLTX_FIELD.number = 2
BCEBULLET_BLTX_FIELD.index = 1
BCEBULLET_BLTX_FIELD.label = 3
BCEBULLET_BLTX_FIELD.has_default_value = false
BCEBULLET_BLTX_FIELD.default_value = {}
BCEBULLET_BLTX_FIELD.type = 5
BCEBULLET_BLTX_FIELD.cpp_type = 1

BCEBULLET_BLTY_FIELD.name = "blty"
BCEBULLET_BLTY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceBullet.blty"
BCEBULLET_BLTY_FIELD.number = 3
BCEBULLET_BLTY_FIELD.index = 2
BCEBULLET_BLTY_FIELD.label = 3
BCEBULLET_BLTY_FIELD.has_default_value = false
BCEBULLET_BLTY_FIELD.default_value = {}
BCEBULLET_BLTY_FIELD.type = 5
BCEBULLET_BLTY_FIELD.cpp_type = 1

BCEBULLET.name = "BceBullet"
BCEBULLET.full_name = ".com.xinqihd.sns.gameserver.proto.BceBullet"
BCEBULLET.nested_types = {}
BCEBULLET.enum_types = {}
BCEBULLET.fields = {BCEBULLET_UID_FIELD, BCEBULLET_BLTX_FIELD, BCEBULLET_BLTY_FIELD}
BCEBULLET.is_extendable = false
BCEBULLET.extensions = {}

BceBullet = protobuf.Message(BCEBULLET)
_G.BCEBULLET_PB_BCEBULLET = BCEBULLET
