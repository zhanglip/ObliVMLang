package com.oblivm.backend.generated.knn2;
import java.util.Arrays;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.BitSet;
import java.security.SecureRandom;
import com.oblivm.backend.oram.SecureArray;
import com.oblivm.backend.oram.CircuitOram;
import com.oblivm.backend.flexsc.Mode;
import com.oblivm.backend.flexsc.Party;
import com.oblivm.backend.flexsc.CompEnv;
import com.oblivm.backend.circuits.arithmetic.IntegerLib;
import com.oblivm.backend.circuits.arithmetic.FloatLib;
import com.oblivm.backend.util.Utils;
import com.oblivm.backend.gc.regular.GCEva;
import com.oblivm.backend.gc.regular.GCGen;
import com.oblivm.backend.gc.GCSignal;
import com.oblivm.backend.flexsc.IWritable;
import com.oblivm.backend.lang.inter.*;
import com.oblivm.backend.flexsc.Comparator;
public class NoClass<t__T> implements IWritable<NoClass<t__T>, t__T>, ISecureRunnable<t__T> {

	public CompEnv<t__T> env;
	public IntegerLib<t__T> intLib;
	public FloatLib<t__T> floatLib;
	public NoClass<t__T> noclass = this;

	public NoClass(CompEnv<t__T> env) throws Exception {
		this.env = env;
		this.intLib = new IntegerLib<t__T>(env);
		this.floatLib = new FloatLib<t__T>(env, 24, 8);
	}

	public int numBits() {
		return 0;
	}

	public t__T[] getBits() throws Exception {
		t__T[] ret = env.newTArray(this.numBits());
		t__T[] tmp_b;
		t__T tmp;
		int now = 0;
		return ret;
	}

	public NoClass<t__T> newObj(t__T[] data) throws Exception {
		if(data == null) {
			data = env.newTArray(this.numBits());
			for(int i=0; i<this.numBits(); ++i) { data[i] = intLib.SIGNAL_ZERO; }
		}
		if(data.length != this.numBits()) return null;
		NoClass<t__T> ret = new NoClass<t__T>(env);
		t__T[] tmp;
		int now = 0;
		return ret;
	}

	public NoClass<t__T> fake() throws Exception {
		NoClass<t__T> ret = new NoClass<t__T>(env);
		return ret;
	}

	public NoClass<t__T> muxFake(t__T __isDummy) throws Exception {
		NoClass<t__T> ret = new NoClass<t__T>(env);
		return ret;
	}

	public t__T lessThan(t__T[] lhs, t__T[] rhs) throws Exception {
		t__T res = env.inputOfAlice(false);
		t__T[] _t_state = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T _t_state_new = env.inputOfAlice(false);
		int _t_count = 0;
		boolean __tmp0 = false;
		res = env.inputOfAlice(__tmp0);
		t__T[] __tmp1 = Arrays.copyOfRange(lhs, 0, 32);
		t__T[] __tmp2 = Arrays.copyOfRange(rhs, 0, 32);
		t__T f_tmp_1 = intLib.not(intLib.geq(__tmp1, __tmp2));
		t__T __tmp3 = f_tmp_1;
		boolean __tmp4 = true;
		t__T f_tmp_4 = env.inputOfAlice(__tmp4);
		t__T __tmp5 = intLib.mux(res, f_tmp_4,__tmp3);
		res = __tmp5;
		return res;

	}
	public t__T[] main(int m, int n, SecureArray<t__T> a, SecureArray<t__T> b) throws Exception {
		t__T[] k = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] aPtr = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] bPtr = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] mPtr = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] bound = env.inputOfAlice(Utils.fromInt(0, 32));
		SecureArray<t__T> merged = new SecureArray<t__T>(env, (m)+(n), 32);
		for(int _j_2 = 0; _j_2 < (m)+(n); ++_j_2) {
			merged.write(intLib.toSignals(_j_2), env.inputOfAlice(Utils.fromInt(0, 32)));
		}
		t__T[] _t_state = env.inputOfAlice(Utils.fromInt(0, 32));
		t__T[] _t_state_new = env.inputOfAlice(Utils.fromInt(0, 3));
		int _t_count = 0;
		int __tmp6 = 8;
		k = env.inputOfAlice(Utils.fromInt(__tmp6, 32));
		int __tmp7 = 0;
		aPtr = env.inputOfAlice(Utils.fromInt(__tmp7, 32));
		int __tmp8 = 0;
		bPtr = env.inputOfAlice(Utils.fromInt(__tmp8, 32));
		int __tmp9 = 0;
		mPtr = env.inputOfAlice(Utils.fromInt(__tmp9, 32));
		int f_tmp_9 = m + n;
		int __tmp10 = f_tmp_9;
		bound = env.inputOfAlice(Utils.fromInt(__tmp10, 32));
		int __tmp11 = 0;
		mPtr = env.inputOfAlice(Utils.fromInt(__tmp11, 32));
		int __tmp12 = 0;
		int __tmp13 = 1;
		int f_tmp_13 = __tmp12 + __tmp13;
		int __tmp14 = f_tmp_13;
		int f_tmp_14 = m + n;
		int __tmp15 = f_tmp_14;
		int f_tmp_15 = __tmp14 + __tmp15;
		int __tmp16 = f_tmp_15;
		_t_count = __tmp16;
		int __tmp17 = 0;
		_t_state = env.inputOfAlice(Utils.fromInt(__tmp17, 32));
		int __tmp18 = 0;
		boolean f_tmp_18 = _t_count >= __tmp18;
		boolean __tmp19 = f_tmp_18;
		while(__tmp19) {
			int __tmp20 = 0;
			t__T[] f_tmp_21 = env.inputOfAlice(Utils.fromInt(__tmp20, 32));
			t__T f_tmp_20 = intLib.eq(_t_state, f_tmp_21);
			t__T __tmp21 = f_tmp_20;
			t__T f_tmp_22 = intLib.not(intLib.geq(mPtr, k));
			t__T __tmp23 = f_tmp_22;
			t__T[] __tmp24 = env.inputOfAlice(Utils.fromInt(1, 3));
			t__T[] __tmp25 = env.inputOfAlice(Utils.fromInt(-1, 3));
			t__T[] __tmp22 = intLib.mux(__tmp25, __tmp24,__tmp23);
			t__T[] __tmp26 = intLib.mux(_t_state_new, __tmp22,__tmp21);
			_t_state_new = __tmp26;
			t__T f_tmp_27 = intLib.not(__tmp21);
			t__T __tmp27 = f_tmp_27;
			int __tmp28 = 1;
			t__T[] f_tmp_30 = env.inputOfAlice(Utils.fromInt(__tmp28, 32));
			t__T f_tmp_29 = intLib.eq(_t_state, f_tmp_30);
			t__T __tmp29 = f_tmp_29;
			t__T f_tmp_31 = intLib.and(__tmp27,__tmp29);
			t__T __tmp30 = f_tmp_31;
			t__T[] f_tmp_33 = env.inputOfAlice(Utils.fromInt(n, 32));
			t__T f_tmp_32 = intLib.not(intLib.geq(bPtr, f_tmp_33));
			t__T __tmp31 = f_tmp_32;
			t__T[] f_tmp_35 = env.inputOfAlice(Utils.fromInt(m, 32));
			t__T f_tmp_34 = intLib.eq(aPtr, f_tmp_35);
			t__T __tmp32 = f_tmp_34;
			t__T[] f_tmp_36 = b.read(bPtr);
			t__T[] __tmp33 = f_tmp_36;
			t__T[] f_tmp_37 = a.read(aPtr);
			t__T[] __tmp34 = f_tmp_37;
			t__T __tmp35 = noclass.lessThan(__tmp33, __tmp34);
			t__T __tmp37 = __tmp35;
			t__T f_tmp_38 = intLib.or(__tmp32,__tmp37);
			t__T __tmp38 = f_tmp_38;
			t__T f_tmp_39 = intLib.and(__tmp31,__tmp38);
			t__T __tmp39 = f_tmp_39;
			t__T f_tmp_40 = intLib.and(__tmp30,__tmp39);
			t__T __tmp40 = f_tmp_40;
			t__T[] f_tmp_41 = b.read(bPtr);
			t__T[] __tmp41 = f_tmp_41;
			t__T[] f_tmp_42 = merged.read(mPtr);
			t__T[] __tmp42 = f_tmp_42;
			t__T[] __tmp43 = intLib.mux(__tmp42, __tmp41,__tmp40);
			merged.write(mPtr,__tmp43);
			int __tmp44 = 1;
			t__T[] f_tmp_46 = env.inputOfAlice(Utils.fromInt(__tmp44, 32));
			t__T[] f_tmp_45 = intLib.add(bPtr,f_tmp_46);
			t__T[] __tmp45 = f_tmp_45;
			t__T[] __tmp46 = intLib.mux(bPtr, __tmp45,__tmp40);
			bPtr = __tmp46;
			t__T f_tmp_48 = intLib.not(__tmp39);
			t__T __tmp47 = f_tmp_48;
			t__T f_tmp_49 = intLib.and(__tmp30,__tmp47);
			t__T __tmp48 = f_tmp_49;
			t__T[] f_tmp_50 = a.read(aPtr);
			t__T[] __tmp49 = f_tmp_50;
			t__T[] f_tmp_51 = merged.read(mPtr);
			t__T[] __tmp50 = f_tmp_51;
			t__T[] __tmp51 = intLib.mux(__tmp50, __tmp49,__tmp48);
			merged.write(mPtr,__tmp51);
			int __tmp52 = 1;
			t__T[] f_tmp_55 = env.inputOfAlice(Utils.fromInt(__tmp52, 32));
			t__T[] f_tmp_54 = intLib.add(aPtr,f_tmp_55);
			t__T[] __tmp53 = f_tmp_54;
			t__T[] __tmp54 = intLib.mux(aPtr, __tmp53,__tmp48);
			aPtr = __tmp54;
			int __tmp55 = 1;
			t__T[] f_tmp_59 = env.inputOfAlice(Utils.fromInt(__tmp55, 32));
			t__T[] f_tmp_58 = intLib.add(mPtr,f_tmp_59);
			t__T[] __tmp56 = f_tmp_58;
			t__T[] __tmp57 = intLib.mux(mPtr, __tmp56,__tmp30);
			mPtr = __tmp57;
			t__T f_tmp_61 = intLib.not(intLib.geq(mPtr, k));
			t__T __tmp59 = f_tmp_61;
			t__T[] __tmp60 = env.inputOfAlice(Utils.fromInt(1, 3));
			t__T[] __tmp61 = env.inputOfAlice(Utils.fromInt(-1, 3));
			t__T[] __tmp58 = intLib.mux(__tmp61, __tmp60,__tmp59);
			t__T[] __tmp62 = intLib.mux(_t_state_new, __tmp58,__tmp30);
			_t_state_new = __tmp62;
			int __tmp63 = 1;
			int f_tmp_67 = _t_count - __tmp63;
			int __tmp64 = f_tmp_67;
			_t_count = __tmp64;
			t__T[] __tmp65 = intLib.enforceBits(_t_state_new, 32);
			_t_state = __tmp65;
			__tmp18 = 0;
			boolean f_tmp_69 = _t_count >= __tmp18;
			__tmp19 = f_tmp_69;
		}
		return k;

	}
	public t__T[] main (int __n, int __m, t__T[] x, t__T[] y) throws Exception {
		int m = __n / (32);
		int n = __m / (32);
		if ( (m) * (32) != __n ) {
			throw new RuntimeException("input size doesn't match");
		}
		if ( (n) * (32) != __m ) {
			throw new RuntimeException("input size doesn't match");
		}
		return main(m, n, com.oblivm.backend.lang.inter.Util.intToSecArray(env, x, 32, m), com.oblivm.backend.lang.inter.Util.intToSecArray(env, y, 32, n));
	}
}
