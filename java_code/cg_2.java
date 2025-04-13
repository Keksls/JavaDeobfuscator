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
 * Renamed from cG
 */
public final class cg_2
extends GeneratedMessageV3.Builder<cg_2>
implements ch_2 {
    private long a;
    private Object b = "";

    public static final Descriptors.Descriptor a() {
        return ak_2.M;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.N.ensureFieldAccessorsInitialized(ce_2.class, cg_2.class);
    }

    cg_2() {
        this.l();
    }

    cg_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (ce_2.k()) {
            // empty if block
        }
    }

    public cg_2 e() {
        super.clear();
        this.a = 0L;
        this.b = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.M;
    }

    public ce_2 f() {
        return ce_2.h();
    }

    public ce_2 g() {
        ce_2 ce_22 = this.h();
        if (!ce_22.isInitialized()) {
            throw cg_2.newUninitializedMessageException((Message)ce_22);
        }
        return ce_22;
    }

    public ce_2 h() {
        ce_2 ce_22 = new ce_2(this);
        ce_22.d = this.a;
        ce_22.e = this.b;
        this.onBuilt();
        return ce_22;
    }

    public cg_2 i() {
        return (cg_2)super.clone();
    }

    public cg_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cg_2)super.setField(fieldDescriptor, object);
    }

    public cg_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cg_2)super.clearField(fieldDescriptor);
    }

    public cg_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cg_2)super.clearOneof(oneofDescriptor);
    }

    public cg_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cg_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cg_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cg_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public cg_2 a(Message message) {
        if (message instanceof ce_2) {
            return this.a((ce_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cg_2 a(ce_2 ce_22) {
        if (ce_22 == ce_2.h()) {
            return this;
        }
        if (ce_22.b() != 0L) {
            this.a(ce_22.b());
        }
        if (!ce_22.c().isEmpty()) {
            this.b = ce_22.e;
            this.onChanged();
        }
        this.b(ce_2.b(ce_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cg_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ce_2 ce_22 = null;
        try {
            ce_22 = (ce_2)ce_2.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ce_22 = (ce_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ce_22 != null) {
                this.a(ce_22);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public cg_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public cg_2 j() {
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

    public cg_2 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.b = string;
        this.onChanged();
        return this;
    }

    public cg_2 k() {
        this.b = ce_2.h().c();
        this.onChanged();
        return this;
    }

    public cg_2 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        ce_2.b(byteString);
        this.b = byteString;
        this.onChanged();
        return this;
    }

    public final cg_2 a(UnknownFieldSet unknownFieldSet) {
        return (cg_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final cg_2 b(UnknownFieldSet unknownFieldSet) {
        return (cg_2)super.mergeUnknownFields(unknownFieldSet);
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

