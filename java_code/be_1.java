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
 * Renamed from be
 */
public final class be_1
extends GeneratedMessageV3.Builder<be_1>
implements bf_1 {
    private long a;
    private Object b = "";

    public static final Descriptors.Descriptor a() {
        return ak_2.q;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.r.ensureFieldAccessorsInitialized(bc_1.class, be_1.class);
    }

    be_1() {
        this.l();
    }

    be_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (bc_1.k()) {
            // empty if block
        }
    }

    public be_1 e() {
        super.clear();
        this.a = 0L;
        this.b = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.q;
    }

    public bc_1 f() {
        return bc_1.h();
    }

    public bc_1 g() {
        bc_1 bc_12 = this.h();
        if (!bc_12.isInitialized()) {
            throw be_1.newUninitializedMessageException((Message)bc_12);
        }
        return bc_12;
    }

    public bc_1 h() {
        bc_1 bc_12 = new bc_1(this);
        bc_12.d = this.a;
        bc_12.e = this.b;
        this.onBuilt();
        return bc_12;
    }

    public be_1 i() {
        return (be_1)super.clone();
    }

    public be_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (be_1)super.setField(fieldDescriptor, object);
    }

    public be_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (be_1)super.clearField(fieldDescriptor);
    }

    public be_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (be_1)super.clearOneof(oneofDescriptor);
    }

    public be_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (be_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public be_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (be_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public be_1 a(Message message) {
        if (message instanceof bc_1) {
            return this.a((bc_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public be_1 a(bc_1 bc_12) {
        if (bc_12 == bc_1.h()) {
            return this;
        }
        if (bc_12.b() != 0L) {
            this.a(bc_12.b());
        }
        if (!bc_12.c().isEmpty()) {
            this.b = bc_12.e;
            this.onChanged();
        }
        this.b(bc_1.b(bc_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public be_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bc_1 bc_12 = null;
        try {
            bc_12 = (bc_1)bc_1.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bc_12 = (bc_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bc_12 != null) {
                this.a(bc_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public be_1 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public be_1 j() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public String c() {
        Object object = this.b;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.b = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString d() {
        Object object = this.b;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.b = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public be_1 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.b = string;
        this.onChanged();
        return this;
    }

    public be_1 k() {
        this.b = bc_1.h().c();
        this.onChanged();
        return this;
    }

    public be_1 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        bc_1.b(byteString);
        this.b = byteString;
        this.onChanged();
        return this;
    }

    public final be_1 a(UnknownFieldSet unknownFieldSet) {
        return (be_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final be_1 b(UnknownFieldSet unknownFieldSet) {
        return (be_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

