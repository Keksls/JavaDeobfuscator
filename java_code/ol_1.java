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
 *  com.google.protobuf.MapField
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
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from ol
 */
public final class ol_1
extends GeneratedMessageV3.Builder<ol_1>
implements on_1 {
    private int a;
    private MapField<String, String> b;

    public static final Descriptors.Descriptor a() {
        return nz_0.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.m();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.n();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nz_0.b.ensureFieldAccessorsInitialized(oj_1.class, ol_1.class);
    }

    ol_1() {
        this.l();
    }

    ol_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (oj_1.k()) {
            // empty if block
        }
    }

    public ol_1 e() {
        super.clear();
        this.n().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nz_0.a;
    }

    public oj_1 f() {
        return oj_1.h();
    }

    public oj_1 g() {
        oj_1 oj_12 = this.h();
        if (!oj_12.isInitialized()) {
            throw ol_1.newUninitializedMessageException((Message)oj_12);
        }
        return oj_12;
    }

    public oj_1 h() {
        oj_1 oj_12 = new oj_1(this);
        int n = this.a;
        oj_12.d = this.m();
        oj_12.d.makeImmutable();
        this.onBuilt();
        return oj_12;
    }

    public ol_1 i() {
        return (ol_1)super.clone();
    }

    public ol_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ol_1)super.setField(fieldDescriptor, object);
    }

    public ol_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ol_1)super.clearField(fieldDescriptor);
    }

    public ol_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ol_1)super.clearOneof(oneofDescriptor);
    }

    public ol_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ol_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ol_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ol_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ol_1 a(Message message) {
        if (message instanceof oj_1) {
            return this.a((oj_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ol_1 a(oj_1 oj_12) {
        if (oj_12 == oj_1.h()) {
            return this;
        }
        this.n().mergeFrom(oj_12.l());
        this.b(oj_1.b(oj_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ol_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        oj_1 oj_12 = null;
        try {
            oj_12 = (oj_1)oj_1.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            oj_12 = (oj_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (oj_12 != null) {
                this.a(oj_12);
            }
        }
        return this;
    }

    private MapField<String, String> m() {
        if (this.b == null) {
            return MapField.emptyMapField(om_1.a);
        }
        return this.b;
    }

    private MapField<String, String> n() {
        this.onChanged();
        if (this.b == null) {
            this.b = MapField.newMapField(om_1.a);
        }
        if (!this.b.isMutable()) {
            this.b = this.b.copy();
        }
        return this.b;
    }

    @Override
    public int b() {
        return this.m().getMap().size();
    }

    @Override
    public boolean a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        return this.m().getMap().containsKey(string);
    }

    @Override
    @Deprecated
    public Map<String, String> c() {
        return this.d();
    }

    @Override
    public Map<String, String> d() {
        return this.m().getMap();
    }

    @Override
    public String a(String string, String string2) {
        if (string == null) {
            throw new NullPointerException();
        }
        Map map = this.m().getMap();
        return map.containsKey(string) ? (String)map.get(string) : string2;
    }

    @Override
    public String b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        Map map = this.m().getMap();
        if (!map.containsKey(string)) {
            throw new IllegalArgumentException();
        }
        return (String)map.get(string);
    }

    public ol_1 j() {
        this.n().getMutableMap().clear();
        return this;
    }

    public ol_1 c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.n().getMutableMap().remove(string);
        return this;
    }

    @Deprecated
    public Map<String, String> k() {
        return this.n().getMutableMap();
    }

    public ol_1 b(String string, String string2) {
        if (string == null) {
            throw new NullPointerException();
        }
        if (string2 == null) {
            throw new NullPointerException();
        }
        this.n().getMutableMap().put(string, string2);
        return this;
    }

    public ol_1 a(Map<String, String> map) {
        this.n().getMutableMap().putAll(map);
        return this;
    }

    public final ol_1 a(UnknownFieldSet unknownFieldSet) {
        return (ol_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ol_1 b(UnknownFieldSet unknownFieldSet) {
        return (ol_1)super.mergeUnknownFields(unknownFieldSet);
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

