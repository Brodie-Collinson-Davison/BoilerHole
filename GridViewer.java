import java.util.*;

public class GridViewer {

    static void view(int[][] grid)
    {
        for (int i = 0; i < grid.length; i ++)
        {
            for (int j = 0; j < grid[i].length; j ++)
            {
                switch (grid[i][j])
                {
                    case Maze.Empty:
                        System.out.print("  ");
                        break;

                    case Maze.WALL.Empty:
                        System.out.print("##");
                        break;

                    case Maze.Start.Empty:
                        System.out.print("^^");
                        break;

                    case Maze.END.Empty:
                        System.out.print("$$");
                        break;

                    case Maze.Visited.Empty:
                        System.out.print("..");
                        break;

                        default:
                            throw new AssertionError();
                }
            }
            System.out.println();
        }
    }
}
