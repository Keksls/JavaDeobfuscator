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
 * Renamed from aW
 */
public final class aw_2
extends GeneratedMessageV3.Builder<aw_2>
implements ax_2 {
    private long a;
    private long b;

    public static final Descriptors.Descriptor a() {
        return ak_2.w;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.x.ensureFieldAccessorsInitialized(au_1.class, aw_2.class);
    }

    aw_2() {
        this.k();
    }

    aw_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.k();
    }

    private void k() {
        if (au_1.j()) {
            // empty if block
        }
    }

    public aw_2 d() {
        super.clear();
        this.a = 0L;
        this.b = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.w;
    }

    public au_1 e() {
        return au_1.g();
    }

    public au_1 f() {
        au_1 au_12 = this.g();
        if (!au_12.isInitialized()) {
            throw aw_2.newUninitializedMessageException((Message)au_12);
        }
        return au_12;
    }

    public au_1 g() {
        au_1 au_12 = new au_1(this);
        au_12.d = this.a;
        au_12.e = this.b;
        this.onBuilt();
        return au_12;
    }

    public aw_2 h() {
        return (aw_2)super.clone();
    }

    public aw_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (aw_2)super.setField(fieldDescriptor, object);
    }

    public aw_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (aw_2)super.clearField(fieldDescriptor);
    }

    public aw_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (aw_2)super.clearOneof(oneofDescriptor);
    }

    public aw_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (aw_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public aw_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (aw_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public aw_2 a(Message message) {
        if (message instanceof au_1) {
            return this.a((au_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public aw_2 a(au_1 au_12) {
        if (au_12 == au_1.g()) {
            return this;
        }
        if (au_12.b() != 0L) {
            this.a(au_12.b());
        }
        if (au_12.c() != 0L) {
            this.b(au_12.c());
        }
        this.b(au_1.b(au_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public aw_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        au_1 au_12 = null;
        try {
            au_12 = (au_1)au_1.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            au_12 = (au_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (au_12 != null) {
                this.a(au_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public aw_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public aw_2 i() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long c() {
        return this.b;
    }

    public aw_2 b(long l) {
        this.b = l;
        this.onChanged();
        return this;
    }

    public aw_2 j() {
        this.b = 0L;
        this.onChanged();
        return this;
    }

    public final aw_2 a(UnknownFieldSet unknownFieldSet) {
        return (aw_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final aw_2 b(UnknownFieldSet unknownFieldSet) {
        return (aw_2)super.mergeUnknownFields(unknownFieldSet);
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

