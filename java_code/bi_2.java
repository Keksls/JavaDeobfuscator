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
 *  com.google.protobuf.LazyStringArrayList
 *  com.google.protobuf.LazyStringList
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.ProtocolStringList
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bi
 */
public final class bi_2
extends GeneratedMessageV3.Builder<bi_2>
implements bk_2 {
    private int a;
    private int b;
    private LazyStringList c = LazyStringArrayList.EMPTY;
    private MapField<String, String> d;

    public static final Descriptors.Descriptor a() {
        return ak_2.U;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 3: {
                return this.t();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 3: {
                return this.u();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.V.ensureFieldAccessorsInitialized(bg_2.class, bi_2.class);
    }

    bi_2() {
        this.r();
    }

    bi_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.r();
    }

    private void r() {
        if (bg_2.o()) {
            // empty if block
        }
    }

    public bi_2 c() {
        super.clear();
        this.b = 0;
        this.c = LazyStringArrayList.EMPTY;
        this.a &= 0xFFFFFFFD;
        this.u().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.U;
    }

    public bg_2 h() {
        return bg_2.k();
    }

    public bg_2 i() {
        bg_2 bg_22 = this.j();
        if (!bg_22.isInitialized()) {
            throw bi_2.newUninitializedMessageException((Message)bg_22);
        }
        return bg_22;
    }

    public bg_2 j() {
        bg_2 bg_22 = new bg_2(this);
        int n = this.a;
        int n2 = 0;
        bg_22.f = this.b;
        if ((this.a & 2) == 2) {
            this.c = this.c.getUnmodifiableView();
            this.a &= 0xFFFFFFFD;
        }
        bg_22.g = this.c;
        bg_22.h = this.t();
        bg_22.h.makeImmutable();
        bg_22.e = n2;
        this.onBuilt();
        return bg_22;
    }

    public bi_2 k() {
        return (bi_2)super.clone();
    }

    public bi_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bi_2)super.setField(fieldDescriptor, object);
    }

    public bi_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bi_2)super.clearField(fieldDescriptor);
    }

    public bi_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bi_2)super.clearOneof(oneofDescriptor);
    }

    public bi_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bi_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bi_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bi_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bi_2 a(Message message) {
        if (message instanceof bg_2) {
            return this.a((bg_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bi_2 a(bg_2 bg_22) {
        if (bg_22 == bg_2.k()) {
            return this;
        }
        if (bg_22.b() != 0) {
            this.c(bg_22.b());
        }
        if (!bg_22.g.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c = bg_22.g;
                this.a &= 0xFFFFFFFD;
            } else {
                this.s();
                this.c.addAll((Collection)bg_22.g);
            }
            this.onChanged();
        }
        this.u().mergeFrom(bg_22.p());
        this.b(bg_2.b(bg_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bi_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bg_2 bg_22 = null;
        try {
            bg_22 = (bg_2)bg_2.k.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bg_22 = (bg_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bg_22 != null) {
                this.a(bg_22);
            }
        }
        return this;
    }

    @Override
    public int b() {
        return this.b;
    }

    public bi_2 c(int n) {
        this.b = n;
        this.onChanged();
        return this;
    }

    public bi_2 l() {
        this.b = 0;
        this.onChanged();
        return this;
    }

    private void s() {
        if ((this.a & 2) != 2) {
            this.c = new LazyStringArrayList(this.c);
            this.a |= 2;
        }
    }

    public ProtocolStringList m() {
        return this.c.getUnmodifiableView();
    }

    @Override
    public int d() {
        return this.c.size();
    }

    @Override
    public String a(int n) {
        return (String)this.c.get(n);
    }

    @Override
    public ByteString b(int n) {
        return this.c.getByteString(n);
    }

    public bi_2 a(int n, String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.s();
        this.c.set(n, (Object)string);
        this.onChanged();
        return this;
    }

    public bi_2 c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.s();
        this.c.add((Object)string);
        this.onChanged();
        return this;
    }

    public bi_2 a(Iterable<String> iterable) {
        this.s();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.c);
        this.onChanged();
        return this;
    }

    public bi_2 o() {
        this.c = LazyStringArrayList.EMPTY;
        this.a &= 0xFFFFFFFD;
        this.onChanged();
        return this;
    }

    public bi_2 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        bg_2.b(byteString);
        this.s();
        this.c.add(byteString);
        this.onChanged();
        return this;
    }

    private MapField<String, String> t() {
        if (this.d == null) {
            return MapField.emptyMapField(bj_1.a);
        }
        return this.d;
    }

    private MapField<String, String> u() {
        this.onChanged();
        if (this.d == null) {
            this.d = MapField.newMapField(bj_1.a);
        }
        if (!this.d.isMutable()) {
            this.d = this.d.copy();
        }
        return this.d;
    }

    @Override
    public int e() {
        return this.t().getMap().size();
    }

    @Override
    public boolean a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        return this.t().getMap().containsKey(string);
    }

    @Override
    @Deprecated
    public Map<String, String> f() {
        return this.g();
    }

    @Override
    public Map<String, String> g() {
        return this.t().getMap();
    }

    @Override
    public String a(String string, String string2) {
        if (string == null) {
            throw new NullPointerException();
        }
        Map map = this.t().getMap();
        return map.containsKey(string) ? (String)map.get(string) : string2;
    }

    @Override
    public String b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        Map map = this.t().getMap();
        if (!map.containsKey(string)) {
            throw new IllegalArgumentException();
        }
        return (String)map.get(string);
    }

    public bi_2 p() {
        this.u().getMutableMap().clear();
        return this;
    }

    public bi_2 d(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.u().getMutableMap().remove(string);
        return this;
    }

    @Deprecated
    public Map<String, String> q() {
        return this.u().getMutableMap();
    }

    public bi_2 b(String string, String string2) {
        if (string == null) {
            throw new NullPointerException();
        }
        if (string2 == null) {
            throw new NullPointerException();
        }
        this.u().getMutableMap().put(string, string2);
        return this;
    }

    public bi_2 a(Map<String, String> map) {
        this.u().getMutableMap().putAll(map);
        return this;
    }

    public final bi_2 a(UnknownFieldSet unknownFieldSet) {
        return (bi_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final bi_2 b(UnknownFieldSet unknownFieldSet) {
        return (bi_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.c();
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
        return this.c();
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
        return this.c();
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
        return this.c();
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

    public /* synthetic */ List n() {
        return this.m();
    }
}

