1. 数组复制：
int[] arr1 = Arrays.copyOf(arr,arr.length);

// 复制数组解析：   (原数组, 从原数组的起始位置, 目标数组, 目标数组的起始位置, 要复制的数组长度）     
// System.arraycopy(src,     srcPos,           dest,     destPos,           length);