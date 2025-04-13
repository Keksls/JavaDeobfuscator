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
 * Renamed from bP
 */
public final class bp_2
extends GeneratedMessageV3.Builder<bp_2>
implements bq_2 {
    private long a;

    public static final Descriptors.Descriptor a() {
        return ak_2.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.f.ensureFieldAccessorsInitialized(bn_1.class, bp_2.class);
    }

    bp_2() {
        this.i();
    }

    bp_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.i();
    }

    private void i() {
        if (bn_1.i()) {
            // empty if block
        }
    }

    public bp_2 c() {
        super.clear();
        this.a = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.e;
    }

    public bn_1 d() {
        return bn_1.f();
    }

    public bn_1 e() {
        bn_1 bn_12 = this.f();
        if (!bn_12.isInitialized()) {
            throw bp_2.newUninitializedMessageException((Message)bn_12);
        }
        return bn_12;
    }

    public bn_1 f() {
        bn_1 bn_12 = new bn_1(this);
        bn_12.c = this.a;
        this.onBuilt();
        return bn_12;
    }

    public bp_2 g() {
        return (bp_2)super.clone();
    }

    public bp_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bp_2)super.setField(fieldDescriptor, object);
    }

    public bp_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bp_2)super.clearField(fieldDescriptor);
    }

    public bp_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bp_2)super.clearOneof(oneofDescriptor);
    }

    public bp_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bp_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bp_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bp_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bp_2 a(Message message) {
        if (message instanceof bn_1) {
            return this.a((bn_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bp_2 a(bn_1 bn_12) {
        if (bn_12 == bn_1.f()) {
            return this;
        }
        if (bn_12.b() != 0L) {
            this.a(bn_12.b());
        }
        this.b(bn_1.b(bn_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bp_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bn_1 bn_12 = null;
        try {
            bn_12 = (bn_1)bn_1.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bn_12 = (bn_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bn_12 != null) {
                this.a(bn_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public bp_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public bp_2 h() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    public final bp_2 a(UnknownFieldSet unknownFieldSet) {
        return (bp_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final bp_2 b(UnknownFieldSet unknownFieldSet) {
        return (bp_2)super.mergeUnknownFields(unknownFieldSet);
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

