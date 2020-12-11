数组转化为list:
List<String> resultList= new ArrayList<>(Arrays.asList(array));

list转化为int[]数组:
list.stream().mapToInt(Integer::valueOf).toArray();

int[]数组转换为 List:
Arrays.stream(new int[]{3,5,8}).boxed().collect(Collectors.toList())

set排序：
set.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

ASCII:
0 = 48
A = 65
a = 97

填充
Arrays.fill(arr, Integer.MAX_VALUE);

数组深拷贝
int[] a = arr.clone();
Arrays.sort(a);

异或规律：
0和任何值的异或等于本身，即：A ^ 0 = A
异或本身等于0，即 A ^ A = 0

HashMap:
//找出map中最多的values值
int key = Collections.max(map.values());
//循环key
for (int m : map.keySet())
//循环key和value
for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
    int key = entry.getKey(), value = entry.getValue();