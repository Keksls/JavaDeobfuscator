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
 * Renamed from B
 */
public final class b_0
extends GeneratedMessageV3.Builder<b_0>
implements d_0 {
    private int a = 0;
    private Object b;
    private Object c = "";
    private int d;

    public static final Descriptors.Descriptor a() {
        return g_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.d.ensureFieldAccessorsInitialized(z_0.class, b_0.class);
    }

    b_0() {
        this.t();
    }

    b_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.t();
    }

    private void t() {
        if (z_0.p()) {
            // empty if block
        }
    }

    public b_0 j() {
        super.clear();
        this.c = "";
        this.d = 0;
        this.a = 0;
        this.b = null;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.c;
    }

    public z_0 k() {
        return z_0.m();
    }

    public z_0 l() {
        z_0 z_02 = this.m();
        if (!z_02.isInitialized()) {
            throw b_0.newUninitializedMessageException((Message)z_02);
        }
        return z_02;
    }

    public z_0 m() {
        z_0 z_02 = new z_0(this);
        z_02.h = this.c;
        z_02.i = this.d;
        if (this.a == 3) {
            z_02.g = this.b;
        }
        if (this.a == 4) {
            z_02.g = this.b;
        }
        z_02.f = this.a;
        this.onBuilt();
        return z_02;
    }

    public b_0 n() {
        return (b_0)super.clone();
    }

    public b_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (b_0)super.setField(fieldDescriptor, object);
    }

    public b_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (b_0)super.clearField(fieldDescriptor);
    }

    public b_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (b_0)super.clearOneof(oneofDescriptor);
    }

    public b_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (b_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public b_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (b_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public b_0 a(Message message) {
        if (message instanceof z_0) {
            return this.a((z_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public b_0 a(z_0 z_02) {
        if (z_02 == z_0.m()) {
            return this;
        }
        if (!z_02.c().isEmpty()) {
            this.c = z_02.h;
            this.onChanged();
        }
        if (z_02.e() != 0) {
            this.a(z_02.e());
        }
        switch (z_02.b()) {
            case a: {
                this.a = 3;
                this.b = z_02.g;
                this.onChanged();
                break;
            }
            case b: {
                this.a = 4;
                this.b = z_02.g;
                this.onChanged();
                break;
            }
        }
        this.b(z_0.b(z_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public b_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        z_0 z_02 = null;
        try {
            z_02 = (z_0)z_0.l.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            z_02 = (z_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (z_02 != null) {
                this.a(z_02);
            }
        }
        return this;
    }

    @Override
    public c_0 b() {
        return c_0.b(this.a);
    }

    public b_0 o() {
        this.a = 0;
        this.b = null;
        this.onChanged();
        return this;
    }

    @Override
    public String c() {
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
    public ByteString d() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public b_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.c = string;
        this.onChanged();
        return this;
    }

    public b_0 p() {
        this.c = z_0.m().c();
        this.onChanged();
        return this;
    }

    public b_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        z_0.b(byteString);
        this.c = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public int e() {
        return this.d;
    }

    public b_0 a(int n) {
        this.d = n;
        this.onChanged();
        return this;
    }

    public b_0 q() {
        this.d = 0;
        this.onChanged();
        return this;
    }

    @Override
    public String f() {
        Object object = "";
        if (this.a == 3) {
            object = this.b;
        }
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (this.a == 3) {
                this.b = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString g() {
        Object object = "";
        if (this.a == 3) {
            object = this.b;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.a == 3) {
                this.b = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    public b_0 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a = 3;
        this.b = string;
        this.onChanged();
        return this;
    }

    public b_0 r() {
        if (this.a == 3) {
            this.a = 0;
            this.b = null;
            this.onChanged();
        }
        return this;
    }

    public b_0 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        z_0.c(byteString);
        this.a = 3;
        this.b = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public String h() {
        Object object = "";
        if (this.a == 4) {
            object = this.b;
        }
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (this.a == 4) {
                this.b = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString i() {
        Object object = "";
        if (this.a == 4) {
            object = this.b;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.a == 4) {
                this.b = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    public b_0 c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a = 4;
        this.b = string;
        this.onChanged();
        return this;
    }

    public b_0 s() {
        if (this.a == 4) {
            this.a = 0;
            this.b = null;
            this.onChanged();
        }
        return this;
    }

    public b_0 c(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        z_0.d(byteString);
        this.a = 4;
        this.b = byteString;
        this.onChanged();
        return this;
    }

    public final b_0 a(UnknownFieldSet unknownFieldSet) {
        return (b_0)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final b_0 b(UnknownFieldSet unknownFieldSet) {
        return (b_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
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
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
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
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

