/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from bD
 */
public final class bd_2
extends GeneratedMessageV3.Builder<bd_2>
implements be_2 {
    private long a;

    public static final Descriptors.Descriptor a() {
        return ak_2.s;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.t.ensureFieldAccessorsInitialized(bb_1.class, bd_2.class);
    }

    bd_2() {
        this.i();
    }

    bd_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.i();
    }

    private void i() {
        if (bb_1.i()) {
            // empty if block
        }
    }

    public bd_2 c() {
        super.clear();
        this.a = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.s;
    }

    public bb_1 d() {
        return bb_1.f();
    }

    public bb_1 e() {
        bb_1 bb_12 = this.f();
        if (!bb_12.isInitialized()) {
            throw bd_2.newUninitializedMessageException((Message)bb_12);
        }
        return bb_12;
    }

    public bb_1 f() {
        bb_1 bb_12 = new bb_1(this);
        bb_12.c = this.a;
        this.onBuilt();
        return bb_12;
    }

    public bd_2 g() {
        return (bd_2)super.clone();
    }

    public bd_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bd_2)super.setField(fieldDescriptor, object);
    }

    public bd_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bd_2)super.clearField(fieldDescriptor);
    }

    public bd_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bd_2)super.clearOneof(oneofDescriptor);
    }

    public bd_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bd_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bd_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bd_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bd_2 a(Message message) {
        if (message instanceof bb_1) {
            return this.a((bb_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bd_2 a(bb_1 bb_12) {
        if (bb_12 == bb_1.f()) {
            return this;
        }
        if (bb_12.b() != 0L) {
            this.a(bb_12.b());
        }
        this.b(bb_1.b(bb_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bd_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bb_1 bb_12 = null;
        try {
            bb_12 = (bb_1)bb_1.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bb_12 = (bb_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bb_12 != null) {
                this.a(bb_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public bd_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public bd_2 h() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    public final bd_2 a(UnknownFieldSet unknownFieldSet) {
        return (bd_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final bd_2 b(UnknownFieldSet unknownFieldSet) {
        return (bd_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.c();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.g();
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
        return this.c();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.g();
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
        return this.g();
    }

    public /* synthetic */ Message buildPartial() {
        return this.f();
    }

    public /* synthetic */ Message build() {
        return this.e();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.c();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.g();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.f();
    }

    public /* synthetic */ MessageLite build() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.c();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.d();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.d();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.g();
    }

    public /* synthetic */ Object clone() {
        return this.g();
    }
}

