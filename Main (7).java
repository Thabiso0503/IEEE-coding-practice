import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));

        int n = nextInt(in);
        int m = nextInt(in);
        int k = nextInt(in);

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            int idx = 0;
            while (idx < m) {
                int c = in.read();
                if (c == '.' || c == '#') {
                    grid[i][idx++] = (char) c;
                }
            }
        }

        int[] dist = new int[n * m];
        Arrays.fill(dist, -1);

        int[] queue = new int[n * m];
        int head = 0, tail = 0;

        for (int i = 0; i < k; i++) {
            int x = nextInt(in) - 1;
            int y = nextInt(in) - 1;
            int id = x * m + y;
            if (dist[id] == -1) {
                dist[id] = 0;
                queue[tail++] = id;
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (head < tail) {
            int cur = queue[head++];
            int cx = cur / m;
            int cy = cur % m;
            int cd = dist[cur];

            for (int dir = 0; dir < 4; dir++) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (grid[nx][ny] == '#') continue;

                int nid = nx * m + ny;
                if (dist[nid] == -1) {
                    dist[nid] = cd + 1;
                    queue[tail++] = nid;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.') {
                    sum += dist[i * m + j];
                }
            }
        }

        System.out.println(sum);
    }

    private static int nextInt(DataInputStream in) throws IOException {
        int ret = 0;
        int b = in.read();
        while (b < '0' || b > '9') {
            b = in.read();
        }
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return ret;
    }
}
