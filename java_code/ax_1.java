/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from ax
 */
public final class ax_1
extends GeneratedMessageV3.Builder<ax_1>
implements ay_2 {
    private int a;
    private ByteString b = ByteString.EMPTY;

    public static final Descriptors.Descriptor a() {
        return ao_2.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ao_2.d.ensureFieldAccessorsInitialized(av_2.class, ax_1.class);
    }

    ax_1() {
        this.k();
    }

    ax_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.k();
    }

    private void k() {
        if (av_2.j()) {
            // empty if block
        }
    }

    public ax_1 d() {
        super.clear();
        this.a = 0;
        this.b = ByteString.EMPTY;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ao_2.c;
    }

    public av_2 e() {
        return av_2.g();
    }

    public av_2 f() {
        av_2 av_22 = this.g();
        if (!av_22.isInitialized()) {
            throw ax_1.newUninitializedMessageException((Message)av_22);
        }
        return av_22;
    }

    public av_2 g() {
        av_2 av_22 = new av_2(this);
        av_22.d = this.a;
        av_22.e = this.b;
        this.onBuilt();
        return av_22;
    }

    public ax_1 h() {
        return (ax_1)super.clone();
    }

    public ax_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ax_1)super.setField(fieldDescriptor, object);
    }

    public ax_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ax_1)super.clearField(fieldDescriptor);
    }

    public ax_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ax_1)super.clearOneof(oneofDescriptor);
    }

    public ax_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ax_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ax_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ax_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ax_1 a(Message message) {
        if (message instanceof av_2) {
            return this.a((av_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ax_1 a(av_2 av_22) {
        if (av_22 == av_2.g()) {
            return this;
        }
        if (av_22.b() != 0) {
            this.a(av_22.b());
        }
        if (av_22.c() != ByteString.EMPTY) {
            this.a(av_22.c());
        }
        this.b(av_2.b(av_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ax_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        av_2 av_22 = null;
        try {
            av_22 = (av_2)av_2.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            av_22 = (av_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (av_22 != null) {
                this.a(av_22);
            }
        }
        return this;
    }

    @Override
    public int b() {
        return this.a;
    }

    public ax_1 a(int n) {
        this.a = n;
        this.onChanged();
        return this;
    }

    public ax_1 i() {
        this.a = 0;
        this.onChanged();
        return this;
    }

    @Override
    public ByteString c() {
        return this.b;
    }

    public ax_1 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.b = byteString;
        this.onChanged();
        return this;
    }

    public ax_1 j() {
        this.b = av_2.g().c();
        this.onChanged();
        return this;
    }

    public final ax_1 a(UnknownFieldSet unknownFieldSet) {
        return (ax_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final ax_1 b(UnknownFieldSet unknownFieldSet) {
        return (ax_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.d();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.h();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.d();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.h();
    }

    public /* synthetic */ Message buildPartial() {
        return this.g();
    }

    public /* synthetic */ Message build() {
        return this.f();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.d();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.h();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.g();
    }

    public /* synthetic */ MessageLite build() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.d();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.e();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.e();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.h();
    }

    public /* synthetic */ Object clone() {
        return this.h();
    }
}

