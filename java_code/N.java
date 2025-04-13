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

public final class N
extends GeneratedMessageV3.Builder<N>
implements O {
    private Object a = "";
    private Object b = "";

    public static final Descriptors.Descriptor a() {
        return e_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.d.ensureFieldAccessorsInitialized(L.class, N.class);
    }

    N() {
        this.m();
    }

    N(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (L.l()) {
            // empty if block
        }
    }

    public N f() {
        super.clear();
        this.a = "";
        this.b = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return e_0.c;
    }

    public L g() {
        return L.i();
    }

    public L h() {
        L l = this.i();
        if (!l.isInitialized()) {
            throw N.newUninitializedMessageException((Message)l);
        }
        return l;
    }

    public L i() {
        L l = new L(this);
        l.d = this.a;
        l.e = this.b;
        this.onBuilt();
        return l;
    }

    public N j() {
        return (N)super.clone();
    }

    public N a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (N)super.setField(fieldDescriptor, object);
    }

    public N a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (N)super.clearField(fieldDescriptor);
    }

    public N a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (N)super.clearOneof(oneofDescriptor);
    }

    public N a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (N)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public N b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (N)super.addRepeatedField(fieldDescriptor, object);
    }

    public N a(Message message) {
        if (message instanceof L) {
            return this.a((L)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public N a(L l) {
        if (l == L.i()) {
            return this;
        }
        if (!l.b().isEmpty()) {
            this.a = l.d;
            this.onChanged();
        }
        if (!l.d().isEmpty()) {
            this.b = l.e;
            this.onChanged();
        }
        this.b(L.b(l));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public N a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        L l = null;
        try {
            l = (L)L.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            l = (L)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (l != null) {
                this.a(l);
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

    public N a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a = string;
        this.onChanged();
        return this;
    }

    public N k() {
        this.a = L.i().b();
        this.onChanged();
        return this;
    }

    public N a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        L.b(byteString);
        this.a = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public String d() {
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
    public ByteString e() {
        Object object = this.b;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.b = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public N b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.b = string;
        this.onChanged();
        return this;
    }

    public N l() {
        this.b = L.i().d();
        this.onChanged();
        return this;
    }

    public N b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        L.c(byteString);
        this.b = byteString;
        this.onChanged();
        return this;
    }

    public final N a(UnknownFieldSet unknownFieldSet) {
        return (N)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final N b(UnknownFieldSet unknownFieldSet) {
        return (N)super.mergeUnknownFields(unknownFieldSet);
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
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
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
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
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
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}

