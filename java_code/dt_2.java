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
 * Renamed from dT
 */
public final class dt_2
extends GeneratedMessageV3.Builder<dt_2>
implements du_2 {
    private int a;
    private int b;

    public static final Descriptors.Descriptor a() {
        return dn_1.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.j.ensureFieldAccessorsInitialized(dr_1.class, dt_2.class);
    }

    dt_2() {
        this.j();
    }

    dt_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.j();
    }

    private void j() {
        if (dr_1.j()) {
            // empty if block
        }
    }

    public dt_2 d() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dn_1.i;
    }

    public dr_1 e() {
        return dr_1.g();
    }

    public dr_1 f() {
        dr_1 dr_12 = this.g();
        if (!dr_12.isInitialized()) {
            throw dt_2.newUninitializedMessageException((Message)dr_12);
        }
        return dr_12;
    }

    public dr_1 g() {
        dr_1 dr_12 = new dr_1(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        dr_12.e = this.b;
        dr_12.d = n2;
        this.onBuilt();
        return dr_12;
    }

    public dt_2 h() {
        return (dt_2)super.clone();
    }

    public dt_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dt_2)super.setField(fieldDescriptor, object);
    }

    public dt_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dt_2)super.clearField(fieldDescriptor);
    }

    public dt_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dt_2)super.clearOneof(oneofDescriptor);
    }

    public dt_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dt_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dt_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dt_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public dt_2 a(Message message) {
        if (message instanceof dr_1) {
            return this.a((dr_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dt_2 a(dr_1 dr_12) {
        if (dr_12 == dr_1.g()) {
            return this;
        }
        if (dr_12.b()) {
            this.a(dr_12.c());
        }
        this.b(dr_1.b(dr_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.b();
    }

    public dt_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dr_1 dr_12 = null;
        try {
            dr_12 = (dr_1)dr_1.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dr_12 = (dr_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dr_12 != null) {
                this.a(dr_12);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public dt_2 a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public dt_2 i() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    public final dt_2 a(UnknownFieldSet unknownFieldSet) {
        return (dt_2)super.setUnknownFields(unknownFieldSet);
    }

    public final dt_2 b(UnknownFieldSet unknownFieldSet) {
        return (dt_2)super.mergeUnknownFields(unknownFieldSet);
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

