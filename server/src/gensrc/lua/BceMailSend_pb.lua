-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceMailSend_pb', package.seeall)


local BCEMAILSEND = protobuf.Descriptor();
local BCEMAILSEND_MAIL_FIELD = protobuf.FieldDescriptor();

BCEMAILSEND_MAIL_FIELD.name = "mail"
BCEMAILSEND_MAIL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceMailSend.mail"
BCEMAILSEND_MAIL_FIELD.number = 1
BCEMAILSEND_MAIL_FIELD.index = 0
BCEMAILSEND_MAIL_FIELD.label = 2
BCEMAILSEND_MAIL_FIELD.has_default_value = false
BCEMAILSEND_MAIL_FIELD.default_value = nil
BCEMAILSEND_MAIL_FIELD.message_type = MAILDATA_PB_MAILDATA
BCEMAILSEND_MAIL_FIELD.type = 11
BCEMAILSEND_MAIL_FIELD.cpp_type = 10

BCEMAILSEND.name = "BceMailSend"
BCEMAILSEND.full_name = ".com.xinqihd.sns.gameserver.proto.BceMailSend"
BCEMAILSEND.nested_types = {}
BCEMAILSEND.enum_types = {}
BCEMAILSEND.fields = {BCEMAILSEND_MAIL_FIELD}
BCEMAILSEND.is_extendable = false
BCEMAILSEND.extensions = {}

BceMailSend = protobuf.Message(BCEMAILSEND)
_G.BCEMAILSEND_PB_BCEMAILSEND = BCEMAILSEND

