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
 * Renamed from cy
 */
public final class cy_1
extends GeneratedMessageV3.Builder<cy_1>
implements cz_2 {
    private long a;
    private long b;

    public static final Descriptors.Descriptor a() {
        return ak_2.I;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.J.ensureFieldAccessorsInitialized(cw_2.class, cy_1.class);
    }

    cy_1() {
        this.k();
    }

    cy_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.k();
    }

    private void k() {
        if (cw_2.j()) {
            // empty if block
        }
    }

    public cy_1 d() {
        super.clear();
        this.a = 0L;
        this.b = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.I;
    }

    public cw_2 e() {
        return cw_2.g();
    }

    public cw_2 f() {
        cw_2 cw_22 = this.g();
        if (!cw_22.isInitialized()) {
            throw cy_1.newUninitializedMessageException((Message)cw_22);
        }
        return cw_22;
    }

    public cw_2 g() {
        cw_2 cw_22 = new cw_2(this);
        cw_22.d = this.a;
        cw_22.e = this.b;
        this.onBuilt();
        return cw_22;
    }

    public cy_1 h() {
        return (cy_1)super.clone();
    }

    public cy_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cy_1)super.setField(fieldDescriptor, object);
    }

    public cy_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cy_1)super.clearField(fieldDescriptor);
    }

    public cy_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cy_1)super.clearOneof(oneofDescriptor);
    }

    public cy_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cy_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cy_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cy_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public cy_1 a(Message message) {
        if (message instanceof cw_2) {
            return this.a((cw_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cy_1 a(cw_2 cw_22) {
        if (cw_22 == cw_2.g()) {
            return this;
        }
        if (cw_22.b() != 0L) {
            this.a(cw_22.b());
        }
        if (cw_22.c() != 0L) {
            this.b(cw_22.c());
        }
        this.b(cw_2.b(cw_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cy_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cw_2 cw_22 = null;
        try {
            cw_22 = (cw_2)cw_2.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cw_22 = (cw_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cw_22 != null) {
                this.a(cw_22);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public cy_1 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public cy_1 i() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long c() {
        return this.b;
    }

    public cy_1 b(long l) {
        this.b = l;
        this.onChanged();
        return this;
    }

    public cy_1 j() {
        this.b = 0L;
        this.onChanged();
        return this;
    }

    public final cy_1 a(UnknownFieldSet unknownFieldSet) {
        return (cy_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final cy_1 b(UnknownFieldSet unknownFieldSet) {
        return (cy_1)super.mergeUnknownFields(unknownFieldSet);
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

