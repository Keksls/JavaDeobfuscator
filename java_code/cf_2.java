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
 * Renamed from cf
 */
public final class cf_2
extends GeneratedMessageV3.Builder<cf_2>
implements cq_1 {
    private long a;
    private Object b = "";
    private Object c = "";

    public static final Descriptors.Descriptor a() {
        return ak_2.S;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.T.ensureFieldAccessorsInitialized(cd_2.class, cf_2.class);
    }

    cf_2() {
        this.o();
    }

    cf_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (cd_2.m()) {
            // empty if block
        }
    }

    public cf_2 g() {
        super.clear();
        this.a = 0L;
        this.b = "";
        this.c = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.S;
    }

    public cd_2 h() {
        return cd_2.j();
    }

    public cd_2 i() {
        cd_2 cd_22 = this.j();
        if (!cd_22.isInitialized()) {
            throw cf_2.newUninitializedMessageException((Message)cd_22);
        }
        return cd_22;
    }

    public cd_2 j() {
        cd_2 cd_22 = new cd_2(this);
        cd_22.e = this.a;
        cd_22.f = this.b;
        cd_22.g = this.c;
        this.onBuilt();
        return cd_22;
    }

    public cf_2 k() {
        return (cf_2)super.clone();
    }

    public cf_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cf_2)super.setField(fieldDescriptor, object);
    }

    public cf_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cf_2)super.clearField(fieldDescriptor);
    }

    public cf_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cf_2)super.clearOneof(oneofDescriptor);
    }

    public cf_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cf_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cf_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cf_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public cf_2 a(Message message) {
        if (message instanceof cd_2) {
            return this.a((cd_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cf_2 a(cd_2 cd_22) {
        if (cd_22 == cd_2.j()) {
            return this;
        }
        if (cd_22.b() != 0L) {
            this.a(cd_22.b());
        }
        if (!cd_22.c().isEmpty()) {
            this.b = cd_22.f;
            this.onChanged();
        }
        if (!cd_22.e().isEmpty()) {
            this.c = cd_22.g;
            this.onChanged();
        }
        this.b(cd_2.b(cd_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cf_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cd_2 cd_22 = null;
        try {
            cd_22 = (cd_2)cd_2.j.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cd_22 = (cd_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cd_22 != null) {
                this.a(cd_22);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public cf_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public cf_2 l() {
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

    public cf_2 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.b = string;
        this.onChanged();
        return this;
    }

    public cf_2 m() {
        this.b = cd_2.j().c();
        this.onChanged();
        return this;
    }

    public cf_2 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        cd_2.b(byteString);
        this.b = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public String e() {
        Object object = this.c;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.c = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString f() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public cf_2 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.c = string;
        this.onChanged();
        return this;
    }

    public cf_2 n() {
        this.c = cd_2.j().e();
        this.onChanged();
        return this;
    }

    public cf_2 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        cd_2.c(byteString);
        this.c = byteString;
        this.onChanged();
        return this;
    }

    public final cf_2 a(UnknownFieldSet unknownFieldSet) {
        return (cf_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final cf_2 b(UnknownFieldSet unknownFieldSet) {
        return (cf_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
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
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
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
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

