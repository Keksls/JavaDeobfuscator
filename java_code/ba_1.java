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
 * Renamed from ba
 */
public final class ba_1
extends GeneratedMessageV3.Builder<ba_1>
implements bb_2 {
    private long a;
    private long b;

    public static final Descriptors.Descriptor a() {
        return ak_2.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.l.ensureFieldAccessorsInitialized(ay_1.class, ba_1.class);
    }

    ba_1() {
        this.k();
    }

    ba_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.k();
    }

    private void k() {
        if (ay_1.j()) {
            // empty if block
        }
    }

    public ba_1 d() {
        super.clear();
        this.a = 0L;
        this.b = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.k;
    }

    public ay_1 e() {
        return ay_1.g();
    }

    public ay_1 f() {
        ay_1 ay_12 = this.g();
        if (!ay_12.isInitialized()) {
            throw ba_1.newUninitializedMessageException((Message)ay_12);
        }
        return ay_12;
    }

    public ay_1 g() {
        ay_1 ay_12 = new ay_1(this);
        ay_12.d = this.a;
        ay_12.e = this.b;
        this.onBuilt();
        return ay_12;
    }

    public ba_1 h() {
        return (ba_1)super.clone();
    }

    public ba_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ba_1)super.setField(fieldDescriptor, object);
    }

    public ba_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ba_1)super.clearField(fieldDescriptor);
    }

    public ba_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ba_1)super.clearOneof(oneofDescriptor);
    }

    public ba_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ba_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ba_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ba_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ba_1 a(Message message) {
        if (message instanceof ay_1) {
            return this.a((ay_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ba_1 a(ay_1 ay_12) {
        if (ay_12 == ay_1.g()) {
            return this;
        }
        if (ay_12.b() != 0L) {
            this.a(ay_12.b());
        }
        if (ay_12.c() != 0L) {
            this.b(ay_12.c());
        }
        this.b(ay_1.b(ay_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ba_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ay_1 ay_12 = null;
        try {
            ay_12 = (ay_1)ay_1.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ay_12 = (ay_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ay_12 != null) {
                this.a(ay_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public ba_1 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public ba_1 i() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long c() {
        return this.b;
    }

    public ba_1 b(long l) {
        this.b = l;
        this.onChanged();
        return this;
    }

    public ba_1 j() {
        this.b = 0L;
        this.onChanged();
        return this;
    }

    public final ba_1 a(UnknownFieldSet unknownFieldSet) {
        return (ba_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final ba_1 b(UnknownFieldSet unknownFieldSet) {
        return (ba_1)super.mergeUnknownFields(unknownFieldSet);
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

