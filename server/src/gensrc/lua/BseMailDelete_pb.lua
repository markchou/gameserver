-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseMailDelete_pb', package.seeall)


local BSEMAILDELETE = protobuf.Descriptor();
local BSEMAILDELETE_DELETECOUNT_FIELD = protobuf.FieldDescriptor();

BSEMAILDELETE_DELETECOUNT_FIELD.name = "deleteCount"
BSEMAILDELETE_DELETECOUNT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseMailDelete.deleteCount"
BSEMAILDELETE_DELETECOUNT_FIELD.number = 2
BSEMAILDELETE_DELETECOUNT_FIELD.index = 0
BSEMAILDELETE_DELETECOUNT_FIELD.label = 1
BSEMAILDELETE_DELETECOUNT_FIELD.has_default_value = false
BSEMAILDELETE_DELETECOUNT_FIELD.default_value = 0
BSEMAILDELETE_DELETECOUNT_FIELD.type = 5
BSEMAILDELETE_DELETECOUNT_FIELD.cpp_type = 1

BSEMAILDELETE.name = "BseMailDelete"
BSEMAILDELETE.full_name = ".com.xinqihd.sns.gameserver.proto.BseMailDelete"
BSEMAILDELETE.nested_types = {}
BSEMAILDELETE.enum_types = {}
BSEMAILDELETE.fields = {BSEMAILDELETE_DELETECOUNT_FIELD}
BSEMAILDELETE.is_extendable = false
BSEMAILDELETE.extensions = {}

BseMailDelete = protobuf.Message(BSEMAILDELETE)
_G.BSEMAILDELETE_PB_BSEMAILDELETE = BSEMAILDELETE

