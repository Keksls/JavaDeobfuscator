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
 * Renamed from x
 */
public final class x_0
extends GeneratedMessageV3.Builder<x_0>
implements y_0 {
    private Object a = "";
    private long b;
    private Object c = "";

    public static final Descriptors.Descriptor a() {
        return g_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.b.ensureFieldAccessorsInitialized(v_0.class, x_0.class);
    }

    x_0() {
        this.o();
    }

    x_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (v_0.m()) {
            // empty if block
        }
    }

    public x_0 g() {
        super.clear();
        this.a = "";
        this.b = 0L;
        this.c = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.a;
    }

    public v_0 h() {
        return v_0.j();
    }

    public v_0 i() {
        v_0 v_02 = this.j();
        if (!v_02.isInitialized()) {
            throw x_0.newUninitializedMessageException((Message)v_02);
        }
        return v_02;
    }

    public v_0 j() {
        v_0 v_02 = new v_0(this);
        v_02.e = this.a;
        v_02.f = this.b;
        v_02.g = this.c;
        this.onBuilt();
        return v_02;
    }

    public x_0 k() {
        return (x_0)super.clone();
    }

    public x_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (x_0)super.setField(fieldDescriptor, object);
    }

    public x_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (x_0)super.clearField(fieldDescriptor);
    }

    public x_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (x_0)super.clearOneof(oneofDescriptor);
    }

    public x_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (x_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public x_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (x_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public x_0 a(Message message) {
        if (message instanceof v_0) {
            return this.a((v_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public x_0 a(v_0 v_02) {
        if (v_02 == v_0.j()) {
            return this;
        }
        if (!v_02.b().isEmpty()) {
            this.a = v_02.e;
            this.onChanged();
        }
        if (v_02.d() != 0L) {
            this.a(v_02.d());
        }
        if (!v_02.e().isEmpty()) {
            this.c = v_02.g;
            this.onChanged();
        }
        this.b(v_0.b(v_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public x_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        v_0 v_02 = null;
        try {
            v_02 = (v_0)v_0.j.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            v_02 = (v_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (v_02 != null) {
                this.a(v_02);
            }
        }
        return this;
    }

    @Override
    public String b() {
        Object object = this.a;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.a = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString c() {
        Object object = this.a;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.a = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public x_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a = string;
        this.onChanged();
        return this;
    }

    public x_0 l() {
        this.a = v_0.j().b();
        this.onChanged();
        return this;
    }

    public x_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        v_0.b(byteString);
        this.a = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public long d() {
        return this.b;
    }

    public x_0 a(long l) {
        this.b = l;
        this.onChanged();
        return this;
    }

    public x_0 m() {
        this.b = 0L;
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

    public x_0 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.c = string;
        this.onChanged();
        return this;
    }

    public x_0 n() {
        this.c = v_0.j().e();
        this.onChanged();
        return this;
    }

    public x_0 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        v_0.c(byteString);
        this.c = byteString;
        this.onChanged();
        return this;
    }

    public final x_0 a(UnknownFieldSet unknownFieldSet) {
        return (x_0)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final x_0 b(UnknownFieldSet unknownFieldSet) {
        return (x_0)super.mergeUnknownFields(unknownFieldSet);
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

