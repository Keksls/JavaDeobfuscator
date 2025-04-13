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
 * Renamed from bH
 */
public final class bh_2
extends GeneratedMessageV3.Builder<bh_2>
implements bi_1 {
    private long a;

    public static final Descriptors.Descriptor a() {
        return ak_2.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.n.ensureFieldAccessorsInitialized(bf_2.class, bh_2.class);
    }

    bh_2() {
        this.i();
    }

    bh_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.i();
    }

    private void i() {
        if (bf_2.i()) {
            // empty if block
        }
    }

    public bh_2 c() {
        super.clear();
        this.a = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.m;
    }

    public bf_2 d() {
        return bf_2.f();
    }

    public bf_2 e() {
        bf_2 bf_22 = this.f();
        if (!bf_22.isInitialized()) {
            throw bh_2.newUninitializedMessageException((Message)bf_22);
        }
        return bf_22;
    }

    public bf_2 f() {
        bf_2 bf_22 = new bf_2(this);
        bf_22.c = this.a;
        this.onBuilt();
        return bf_22;
    }

    public bh_2 g() {
        return (bh_2)super.clone();
    }

    public bh_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bh_2)super.setField(fieldDescriptor, object);
    }

    public bh_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bh_2)super.clearField(fieldDescriptor);
    }

    public bh_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bh_2)super.clearOneof(oneofDescriptor);
    }

    public bh_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bh_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bh_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bh_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bh_2 a(Message message) {
        if (message instanceof bf_2) {
            return this.a((bf_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bh_2 a(bf_2 bf_22) {
        if (bf_22 == bf_2.f()) {
            return this;
        }
        if (bf_22.b() != 0L) {
            this.a(bf_22.b());
        }
        this.b(bf_2.b(bf_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bh_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bf_2 bf_22 = null;
        try {
            bf_22 = (bf_2)bf_2.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bf_22 = (bf_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bf_22 != null) {
                this.a(bf_22);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public bh_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public bh_2 h() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    public final bh_2 a(UnknownFieldSet unknownFieldSet) {
        return (bh_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final bh_2 b(UnknownFieldSet unknownFieldSet) {
        return (bh_2)super.mergeUnknownFields(unknownFieldSet);
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

